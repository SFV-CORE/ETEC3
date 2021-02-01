/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansProdutos;
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
public class DaoProduto {

    //Variaveis instanciadas
    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    //----------

    //Crud--
    public int cadastrar(BeansProdutos mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Produto"
                    + "(cod_prod, nome_prod, descricao, val_unit, unidade, ativo) "
                    + "VALUES(?,?, ?, ?, ?, 1)");// Define a query do insert
            //seta os valores
            pst.setInt(1, mod.get_codProd());
            pst.setString(2, mod.get_nome_prod());
            pst.setString(3, mod.get_descricao());
            pst.setDouble(4, mod.get_valUnit());
            pst.setInt(5, mod.get_unidade());
            //----
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o Produto!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public int alterar(BeansProdutos mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Produto"
                    + " SET nome_prod = ?, descricao = ?, val_unit = ?"
                    + ", unidade = ?"
                    + " WHERE cod_prod = ?");// Define a query
            //seta os valores
            pst.setString(1, mod.get_nome_prod());
            pst.setString(2, mod.get_descricao());
            pst.setDouble(3, mod.get_valUnit());
            pst.setInt(4, mod.get_unidade());
            pst.setInt(5, mod.get_codProd());
            //-----
            pst.executeUpdate();// Executa a query
            //exibe a mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Produto!/nErro: " + e);
            //define valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public int alterarQuant( int uni, int cod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Produto"
                    + " SET unidade = ?"
                    + " WHERE cod_prod = ?");// Define a query
            //seta os valores
            pst.setInt(1, uni);
            pst.setInt(2, cod);
            //-----
            pst.executeUpdate();// Executa a query
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel alterar o Produto!/nErro: " + e);
            //define valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }
    
    //ao inves de excluir ele desativa o produto
    public int mudarAtivo(BeansProdutos mod) {
        con.Conexao();// inicia a conexão
        int r;//variavel de retorno
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE Produto "
                    + "SET ativo = ? WHERE cod_prod = ? ");// Define a query
            //seta os valores
            pst.setInt(1, mod.getAtivo());
            pst.setInt(2, mod.get_codProd());
            //--------
            pst.execute();// Executa a query
            //exibe a mensagem de sucesso de acordo com a operação
            if (mod.getAtivo() == 1) {
                JOptionPane.showMessageDialog(null, "Produto ativado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Produto desativado com sucesso!");
            }
            //define valor de retorno como 1
            r = 1;
        } catch (SQLException e) {
            //Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Não foi possivel excluir o Produto!/nErro: " + e);
            //define o valor de retorno como 0
            r = 0;
        } finally {
            con.fecharConn();// Fecha a conexão com o banco
        }
        return r;//retorna r
    }

    public void consulta(BeansProdutos mod) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Cliente WHERE cnpj LIKE '" + mod.get_codProd() + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe mensagem de erro
        }
    }

    //-----
    //Puxar dados para a tabela
    public void mostrarTodos(DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Produto WHERE ativo = 1";//vai pegar só os produtos ativos
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_prod"),
                        rs.getString("nome_prod"),
                        rs.getString("descricao"),
                        rs.getString("val_unit"),
                        rs.getString("unidade"),
                        rs.getString("ativo")
                    });
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado!");
            }
            rs.close();//fecha a pesquisa
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    public void mostraPorNome(String nome, DefaultTableModel model) {
        con.Conexao();//inicia a conexão
        try {
            String query = "SELECT * FROM Produto WHERE nome_prod LIKE '%" + nome + "%'";//define a query 
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query);//executa a query e guarda o resultado

            DefaultTableModel modelo = (DefaultTableModel) model;//instancia a tabela
            modelo.setNumRows(0);//zera as linhas
            //verifica se tem registro  
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    modelo.addRow(new Object[]{
                        rs.getString("cod_prod"),
                        rs.getString("nome_prod"),
                        rs.getString("descricao"),
                        rs.getString("val_unit"),
                        rs.getString("unidade"),
                        rs.getString("ativo")
                    });
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado!");
            }
            rs.close();//fechar a pesquisa
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
    }

    //pegar o codigo do produto a partir do nome dele
    public int pegarCodigo(String mod) {
        con.Conexao();//inicia a conexão
        int r = 0;//valor de retorno
        try {
            String query = "SELECT * FROM Produto WHERE nome_prod LIKE '" + mod + "'";//define a query
            stms = con.conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);//configura as regras
            rs = stms.executeQuery(query); //executa a query e guarda o resultado
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    r = Integer.parseInt(rs.getString("cod_prod"));
                }
            } else {
                //se não tiver registro, exibe a mensagem
                JOptionPane.showMessageDialog(null, "Nenhum Produto encontrado!");
            }
            rs.close();//fecha a pesquisa
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + ex.getMessage());//exibe a mensagem
        } finally {
            con.fecharConn();//fecha a conexão
        }
        return r;
    }
    
    public int pegarQuant(int mod) {
        con.Conexao();//inicia a conexão
        int r = 0;//valor de retorno
        try {
            String query = "SELECT * FROM Produto WHERE cod_prod = ?";//define a query
            PreparedStatement pst = con.conn.prepareStatement(query);
            //seta os valores
            pst.setInt(1, mod);
            //executa e guarda o resultado
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while
                while (rs.next()) {
                    r = rs.getInt("unidade");
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
