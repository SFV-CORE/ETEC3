/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansCliente;
import ModelConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brisado2p
 */
public class DaoCliente {

    //Variaveis importantes
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    //----------

    //Crud----
    public int cadastrar(BeansCliente mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Cliente"
                    + "(nome_clie, cep, cnpj, cidade, endereco, uf, ativo) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?)");// Define a query do insert
            //seta os valores
            pst.setString(1, mod.get_nome());
            pst.setString(2, mod.get_cep());
            pst.setString(3, mod.get_cnpj());
            pst.setString(4, mod.get_cidade());
            pst.setString(5, mod.get_endereco());
            pst.setString(6, mod.get_uf());
            pst.setInt(7, mod.getAtivo());
            //-----------
            pst.execute();//executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o Cliente!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna valor especifico
    }

    public int alterar(BeansCliente mod) {
        con.Conexao();// inicia a conexão
        int r;
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Cliente SET nome_clie = ?, cep = ?, cnpj = ?,"
                    + "cidade = ?, endereco = ?, uf = ?"
                    + " WHERE cod_clie = ?");// Define a query do insert
            pst.setString(1, mod.get_nome());// Define o nome
            pst.setString(2, mod.get_cep());// Define o cep
            pst.setString(3, mod.get_cnpj());// Define o cnpj
            pst.setString(4, mod.get_cidade());// Define a cidade
            pst.setString(5, mod.get_endereco());// Define endereço
            pst.setString(6, mod.get_uf());// Define o uf
            pst.setInt(7, mod.get_codClie());//define o codigo do cliente
            pst.executeUpdate();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Cliente!/nErro: " + e);// Caso de erro, mostrará a mensagem junto com o erro
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco 
        }
        return r;//retorna o r
    }

    public int mudarAtivo(BeansCliente mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Cliente "
                    + "SET ativo = ? WHERE cod_clie = ? ");// Define a query do insert
            //seta as variaveis
            pst.setInt(1, mod.getAtivo());
            pst.setInt(2, mod.get_codClie());
            //------
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            if(mod.getAtivo() == 1){
                JOptionPane.showMessageDialog(null, "Cliente ativado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Cliente desativado com sucesso!");
            }
            
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel realizar a operação!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public void consulta(BeansCliente mod) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Cliente WHERE cnpj LIKE '" + mod.get_cnpj() + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe mensagem de erro
        }
    }
    //--------
    //Puxar dados para a tabela

    public void mostrarTodos(DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Cliente WHERE ativo = 1";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura a pesquisa
            rs = stms.executeQuery(query);//executa a pesquisa

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linnhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    //adiciona as linhas respectivamente
                    modelo.addRow(new Object[]{
                        rs.getString("cod_clie"),
                        rs.getString("nome_clie"),
                        rs.getString("cep"),
                        rs.getString("cnpj"),
                        rs.getString("cidade"),
                        rs.getString("uf"),
                        rs.getString("endereco"),
                        rs.getString("ativo")
                    });
                }
                rs.close();//fecha a pesquisa
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe erro
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public void mostrarPorNome(BeansCliente mod, DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Cliente WHERE nome_clie LIKE '%" + mod.get_nome() + "%'";//define a query para pesquisar por nome
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura a pesquisa
            rs = stms.executeQuery(query);//executa a pesquisa

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_clie"),
                        rs.getString("nome_clie"),
                        rs.getString("cep"),
                        rs.getString("cnpj"),
                        rs.getString("cidade"),
                        rs.getString("uf"),
                        rs.getString("endereco"),
                        rs.getString("ativo")
                    });
                }
                rs.close();//fechar a pesquisa
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Cliente cadastrado!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

}
