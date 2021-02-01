/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansPedido;
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
public class DaoPedido {

    //variaveis instanciadas
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    //----

    public int cadastrar(BeansPedido mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno

        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Pedido"
                    + "(cod_ped, dt_emissao, pr_entrega, valor_total, cod_ven_fk, cnpj_fk) "
                    + "VALUES(?, ?, ?, ?, ?, ?)");// Define a query do insert
            //seta os valores
            pst.setInt(1, mod.get_codPed());
            pst.setString(2, mod.get_dt_emissao());
            pst.setString(3, mod.get_prazoEntrega());
            pst.setDouble(4, mod.get_valTotal());
            pst.setInt(5, mod.get_codVen());
            pst.setString(6, mod.get_cnpj());
            //-----
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o Pedido!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public int alterar(BeansPedido mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno

        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Pedido"
                    + " SET dt_emissao = ?, pr_entrega = ?, valor_total = ?"
                    + ", cod_ven_fk = ?, cnpj_fk = ? "
                    + "WHERE cod_ped = ?");// Define a query
            //seta os valores
            pst.setString(1, mod.get_dt_emissao());
            pst.setString(2, mod.get_prazoEntrega());
            pst.setDouble(3, mod.get_valTotal());
            pst.setInt(4, mod.get_codVen());
            pst.setString(5, mod.get_cnpj());
            pst.setInt(6, mod.get_codPed());
            //----
            pst.executeUpdate();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Pedido!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public void alterarValor(Double val_total, int cod_ped) {
        con.Conexao();// inicia a conexão
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Pedido"
                    + " SET valor_total = ? "
                    + "WHERE cod_ped = ?");// Define a query 
            //seta os valores
            pst.setDouble(1, val_total);
            pst.setInt(2, cod_ped);
            //------
            pst.executeUpdate();// Executa a query      
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Pedido!/nErro: " + e);
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
    }

    public int excluir(BeansPedido mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("DELETE FROM Item_Pedido "
                    + "WHERE cod_ped = ?; DELETE FROM Pedido WHERE cod_ped = ? ");// Define a query 
            //seta os valores
            pst.setInt(1, mod.get_codPed());
            pst.setInt(2, mod.get_codPed());
            //---
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Pedido exculido com sucesso!");
            //define o valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o Pedido!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public void consulta(BeansPedido mod) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Pedido WHERE cod_ped LIKE '" + mod.get_codPed() + "'";// Define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);   //executa a query e guarda o resultado
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe mensagem de erro
        }
    }

    //---------
    //Puxar dados 
    public void mostrarTodos(DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Pedido";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ped"),
                        rs.getString("dt_emissao"),
                        rs.getString("pr_entrega"),
                        rs.getString("valor_total"),
                        rs.getString("cod_ven_fk"),
                        rs.getString("cnpj_fk")
                    });
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Pedido encontrado!");
            }
            rs.close();//fecha a pesquisa
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public void mostrarPorCod(BeansPedido mod, DefaultTableModel model) {
        con.Conexao();
        try {
            String query = "SELECT * FROM Pedido WHERE cod_ped LIKE '%" + mod.get_codPed() + "%'";//define a query
            stms = con.conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ped"),
                        rs.getString("dt_emissao"),
                        rs.getString("pr_entrega"),
                        rs.getString("valor_total"),
                        rs.getString("cod_ven_fk"),
                        rs.getString("cnpj_fk")
                    });
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Pedido encontrado!");
            }
            rs.close();//fecha a pesquisa
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public double pegarValor(int mod) {
        con.Conexao();//inicia a conexão
        double r = 0;//valor de retorno
        try {
            String query = "SELECT * FROM Pedido WHERE cod_ped = ?";//define a query
            PreparedStatement pst = con.conn.prepareStatement(query);
            //seta os valores
            pst.setInt(1, mod);
            //executa e guarda o resultado
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    r = Double.parseDouble(rs.getString("valor_total"));
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        }
        return r;//fecha a conexão
    }
}
