/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansItemPedido;
import ModelConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public class DaoItemPedido {

    //Variaveis importantes
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    final DaoPedido ped = new DaoPedido();
    final DaoProduto prod = new DaoProduto();
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    //--------

    //Crud-------
    public double cadastrar(BeansItemPedido mod) {
        con.Conexao();// inicia a conexão
        double val_total = 0;//variavel de retorno
        try {
            //insere produto no pedido
            PreparedStatement pst = con.conn.prepareStatement("SET IDENTITY_INSERT dbo.Item_Pedido  ON; "
                    + "INSERT INTO Item_Pedido"
                    + "(quant, cod_prod, cod_ped) "
                    + "VALUES(?,?, ?)");// Define a query do insert
            //seta os valores
            pst.setInt(1, mod.get_quant());
            pst.setInt(2, mod.get_codProd());
            pst.setInt(3, mod.get_codPed());
            //-------
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!");
            //altera o valor total do pedido
            val_total = ped.pegarValor(mod.get_codPed());//pega o valor anterior do pedido
            val_total += pegarValorUni(mod);//soma com o item adicionado
            
            int quant = prod.pegarQuant(mod.get_codProd());
            int quant_total = quant - mod.get_quant();
            prod.alterarQuant(quant_total, mod.get_codProd());

            ped.alterarValor(val_total, mod.get_codPed());//realiza o update do valor no bd
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel adicionar o Produto!/nErro: " + e);
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return val_total;//retorna valor especifico
    }

    public int excluir(BeansItemPedido mod) {
        con.Conexao();// inicia a conexão
        int r = 0;//variavel de retorno
        double val_total;//variavel para atualizar valor total
        try {
            PreparedStatement pst = con.conn.prepareStatement("DELETE FROM Item_Pedido "
                    + "WHERE quant = ? AND cod_prod = ? AND cod_ped = ? ");// Define a query do insert
            //seta os valores
            pst.setInt(1, mod.get_quant());
            pst.setInt(2, mod.get_codProd());
            pst.setInt(3, mod.get_codPed());
            //-----
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto retirado com sucesso!");
            //altera o valor total do pedido
            val_total = ped.pegarValor(mod.get_codPed());//pega o valor anterior do pedido
            val_total -= pegarValorUni(mod);//soma com o item adicionado

            int quant = prod.pegarQuant(mod.get_codProd());
            int quant_total = quant + mod.get_quant();
            prod.alterarQuant(quant_total, mod.get_codProd());
            
            ped.alterarValor(val_total, mod.get_codPed());//realiza o update do valor no bd
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel retirar o Produto!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public void consulta(BeansItemPedido mod) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Item_Pedido WHERE cod_ped LIKE '" + mod.get_codPed() + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe mensagem de erro
        }
    }

    //---------
    //Puxar dados para a tabela
    public void mostrarTodosItemPed(BeansItemPedido mod, DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT P.nome_prod, I.quant, P.val_unit FROM Produto P"
                    + "	INNER JOIN Item_Pedido I on I.cod_prod = P.cod_prod"
                    + "	INNER JOIN Pedido ped on ped.cod_ped = I.cod_ped WHERE ped.cod_ped = ?";//define a query 
            PreparedStatement pst = con.conn.prepareStatement(query);
            //seta os valores
            pst.setInt(1, mod.get_codPed());
            //executa e guarda o resultado
            rs = pst.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("nome_prod"),
                        rs.getString("quant"),
                        rs.getString("val_unit")
                    });
                }
                rs.close();//fechar a pesquisa
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Produto adicionado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public double pegarValorUni(BeansItemPedido mod) {
        con.Conexao();//inicia a conexão
        double r = 0;//valor de retorno
        try {
            String query = " SELECT * FROM Produto WHERE cod_prod = ? ";//define a query 
            PreparedStatement pst = con.conn.prepareStatement(query);
            //seta os valores
            pst.setInt(1, mod.get_codProd());
            //executa a pesquisa e guarda o valor
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    r = Double.parseDouble(rs.getString("val_unit"));//pega o valor unitario
                    r = r * mod.get_quant();//multiplica pela quantidade
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
            //define o valor de retorno como 0
            r = 0;
        }
        return r;//retorna o valor total
    }
}
