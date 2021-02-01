/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansUsuarios;
import ModelConnection.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brisado2p
 */
public class DaoUsuario {

    //Variaveis importantes
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    //-------------------
    //Crud---------

    public int cadastrar(BeansUsuarios mod) {
        con.Conexao();// inicia a conexão
        int r;//cria a variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Usuario"
                    + "(cod_user, nome_user, senha, adm, cod_ven_fk)"
                    + "VALUES(?, ?, ?, ?, ?)");// Define a query do insert
            //Seta os valores
            pst.setInt(1, mod.get_codUser());
            pst.setString(2, mod.get_nome());
            pst.setString(3, mod.get_senha());
            pst.setInt(4, mod.get_adm());
            pst.setInt(5, mod.get_codVen());
            //--------------
            pst.execute();// Executa a query
            //Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            //define varivel de retorno como 1
            r = 1;
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o Usuário!/nErro: " + e);
            //define varivel de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna a variavel r
    }

    public int alterar(BeansUsuarios mod) {
        con.Conexao();// inicia a conexão
        int r;//cria a variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Usuario"
                    + " SET nome_user = ?, senha = ?, adm = ? "
                    + "WHERE cod_ven_fk = ?");// Define a query
            //Seta os valores
            pst.setString(1, mod.get_nome());
            pst.setString(2, mod.get_senha());
            pst.setInt(3, mod.get_adm());
            pst.setInt(4, mod.get_codVen());
            //--------------
            pst.executeUpdate();// Executa a query
            //Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
            //define varivel de retorno como 1
            r = 1;
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Usuário!/nErro: " + e);
            //define varivel de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna a variavel r

    }

    public int excluir(BeansUsuarios mod) {
        con.Conexao();// inicia a conexão
        int r;//cria a variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("DELETE FROM usuario "
                    + "WHERE cod_user = ? ");// Define a query
            //Seta os valores
            pst.setInt(1, mod.get_codUser());
            //--------------
            pst.execute();// Executa a query
            //Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Usuário excluido com sucesso!");
            //define varivel de retorno como 1
            r = 1;
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o Usuário!/nErro: " + e);
            //define varivel de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna a variavel r
    }

    public void consulta(BeansUsuarios mod) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Usuario WHERE cod_ven_fk LIKE '" + mod.get_codVen() + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado
        } catch (Exception ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
    }

    public int alterarSenha(BeansUsuarios mod) {
        con.Conexao();// inicia a conexão
        int r;//cria a variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Usuario"
                    + " SET senha = ? "
                    + "WHERE cod_ven_fk = ?");// Define a query do insert
            //Seta os valores
            pst.setString(1, mod.get_senha());
            pst.setInt(2, mod.get_codVen());
            //--------------
            pst.executeUpdate();// Executa a query
            //Exibe mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
            //define varivel de retorno como 1
            r = 1;
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar a Senha!/nErro: " + e);
            //define varivel de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna a variavel r
    }

    //--------------
    //Puxar dados para a tabela
    public void mostrarTodos(DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Usuario";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_user"),
                        rs.getString("nome_user"),
                        rs.getString("adm"),
                        rs.getString("cod_ven_fk"),
                        rs.getString("senha")
                    });
                }
                rs.close();//fecha a pesquisa
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }
    
    

    public void mostrarPorNome(BeansUsuarios mod, DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Usuario WHERE nome_user LIKE '%" + mod.get_nome() + "%'";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_user"),
                        rs.getString("nome_user"),
                        rs.getString("adm"),
                        rs.getString("cod_ven_fk"),
                        rs.getString("senha")
                    });
                }
                rs.close();//fecha a pesquisa
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum usuario cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    //--------------
    //Metodo usado no Login 
    public void executaSQL(String query) {
        con.Conexao();// inicia a conexão
        try {
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado
        } catch (Exception ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
    }

}
