/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansVendedores;
import ModelConnection.ConexaoBD;
import java.util.ArrayList;
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
public class DaoVendedor {

    //Variaveis importantes
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    public Statement stms;
    public ResultSet rs; // Armazenar o resultado
    //----------

    //Crud--------
    public int cadastrar(BeansVendedores mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Vendedor"
                    + "(nome_ven, sal_fixo, comissao, ativo) "
                    + "VALUES(?,?, ?, ?)");// Define a query do insert
            //seta os valores
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getSalFixo());
            pst.setDouble(3, mod.getComissao());
            pst.setInt(4, mod.getAtivo());
            //---------
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Vendedor cadastrado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o Vendedor!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna valor especifico
    }

    public int alterar(BeansVendedores mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Vendedor"
                    + " SET nome_ven = ?, sal_fixo = ?, comissao = ?"
                    + " WHERE cod_ven = ?");// Define a query 
            //seta os valores
            pst.setString(1, mod.getNome());
            pst.setDouble(2, mod.getSalFixo());
            pst.setDouble(3, mod.getComissao());
            pst.setInt(4, mod.getCodVend());
            //-------
            pst.executeUpdate();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Vendedor alterado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Vendedor!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna valor especifico
    }

    public int mudarAtivo(BeansVendedores mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Vendedor"
                    + " SET ativo = ? WHERE cod_ven = ?; "
                    + "DELETE Usuario WHERE cod_ven_fk = ?");// Define a query 
            //seta os valores
            pst.setInt(1, mod.getAtivo());
            pst.setInt(2, mod.getCodVend());
            pst.setInt(3, mod.getCodVend());
            //----------
            pst.executeUpdate();// Executa a query
            //exibe a mensagem de sucesso de acordo com a operação
            if (mod.getAtivo() == 1) {
                JOptionPane.showMessageDialog(null, "Vendedor habilitado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Vendedor desabilitado com sucesso!");
            }
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel executar a operação!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna valor especifico
    }

    public void consulta(BeansVendedores mod) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Vendedor WHERE nome_ven LIKE '" + mod.getNome() + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado
        } catch (Exception ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
    }

    //--------------
    //Puxar dados para a tabela        
    public void mostrarTodos(DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Vendedor WHERE ativo = 1";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ven"),
                        rs.getString("nome_ven"),
                        rs.getString("sal_fixo"),
                        rs.getString("comissao"),
                        rs.getString("ativo")
                    });
                }
                rs.close();//fecha a pesquisa
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }
    
    public void mostrarTodosL(DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Vendedor WHERE ativo = 1";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ven"),
                        rs.getString("nome_ven"),
                        rs.getString("ativo")
                    });
                }
                rs.close();//fecha a pesquisa
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public void mostrarPorNome(BeansVendedores mod, DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Vendedor WHERE nome_ven LIKE '%" + mod.getNome() + "%'";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ven"),
                        rs.getString("nome_ven"),
                        rs.getString("sal_fixo"),
                        rs.getString("comissao"),
                        rs.getString("ativo")
                    });
                }
                rs.close();
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }
    
    public void mostrarPorNomeL(BeansVendedores mod, DefaultTableModel model) {
        con.Conexao();// inicia a conexão
        try {
            String query = "SELECT * FROM Vendedor WHERE nome_ven LIKE '%" + mod.getNome() + "%'";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia o modelo da tabela
            modelo.setNumRows(0);//limpa as linhas da tabela
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_ven"),
                        rs.getString("nome_ven"),
                        rs.getString("ativo")
                    });
                }
                rs.close();
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }
    
    public ArrayList<String> pegarNome() {
        con.Conexao();// inicia a conexão
        ArrayList<String> lista = new ArrayList();
        try {
            String query = "SELECT * FROM Vendedor WHERE ativo = 1";// Define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras da consulta
            rs = stms.executeQuery(query);//executa a consulta e guarda o resultado
            
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir as linhas na tabela
                
                while (rs.next()) {
                    lista.add(rs.getString("nome_ven"));
                }
                rs.close();
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum vendedor cadastrado!");
                lista.add("Null");
            }
        } catch (SQLException ex) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
            lista.add("Null");
        } finally {
            con.fecharConn();//fecha a conexão
        }
        return lista;
    }
    
    public int pegarCodigo(String mod) {
        con.Conexao();
        int r =0;
        
        try {
            String query = "SELECT * FROM Vendedor WHERE nome_ven = ?";
            PreparedStatement pst = con.conn.prepareStatement(query);
            pst.setString(1, mod);
            rs = pst.executeQuery(); 
            
            while(rs.next()){
                r = Integer.parseInt(rs.getString("cod_ven"));
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
        return r;
    }
    
    public String pegarPorCodigo(int mod) {
        con.Conexao();
        String r = "";
        
        try {
            String query = "SELECT * FROM Vendedor WHERE cod_ven = ?";
            PreparedStatement pst = con.conn.prepareStatement(query);
            pst.setInt(1, mod);
            rs = pst.executeQuery(); 
            
            while(rs.next()){
                r = rs.getString("nome_ven");
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
        return r;
    }
    
    public void pegarAtivo(int mod) {
        con.Conexao();
  
        try {
            String query = "SELECT * FROM Vendedor "
                    + "WHERE cod_ven = ? AND ativo = 1";
            PreparedStatement pst = con.conn.prepareStatement(query);
            pst.setInt(1, mod);
            rs = pst.executeQuery(); 

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());
        }
    }
}
