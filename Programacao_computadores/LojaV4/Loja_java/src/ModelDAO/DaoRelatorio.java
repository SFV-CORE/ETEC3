/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class DaoRelatorio {

    final ConexaoBD con = new ConexaoBD();// Instancia a conexão
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado

    public String faturamentoDatas(String data1, String data2) {
        con.Conexao();//inicia a conexão
        String valor = "";//inicia a variavel
        try {
            PreparedStatement pst = con.conn.prepareStatement("select sum(valor_total) from Pedido"
                    + " where dt_emissao between ? and ? ");// Define a query
            //seta os valores
            pst.setString(1, data1);
            pst.setString(2, data2);
            //executa a consulta e guarda o valor
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir os valores na variavel
                while (rs.next()) {
                    valor = rs.getString(1);
                }
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado");
            }
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + e.getMessage());
        } finally {
            con.fecharConn();// Fecha a conexão com o banco         
        }
        return valor;//retorna o resultado
    }

    public String faturamentoVendedores(String vend) {
        con.Conexao();//inicia a conexão
        String valor = "";//inicia a variavel
        try {
            PreparedStatement pst = con.conn.prepareStatement("SELECT SUM(p.valor_total) FROM Pedido p"
                    + " INNER JOIN Vendedor v ON v.cod_ven = p.cod_ven_fk"
                    + " WHERE v.nome_ven = ?");// Define a query do insert
            //seta os valores
            pst.setString(1, vend);
            //executa a consulta e guarda o valor
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                //se tiver executa o while que vai inserir os valores na variavel
                while (rs.next()) {
                    valor = rs.getString(1);
                }
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado");
            }
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + e.getMessage());
        } finally {
            con.fecharConn();// Fecha a conexão com o banco         
        }

        return valor;//retorna o resultado
    }

    public String faturamentoProdutos(String data1, String data2) {
        con.Conexao();//inicia a conexão
        String valor = "";//inicia a variavel
        try {
            PreparedStatement pst = con.conn.prepareStatement("select sum(quant) from Item_Pedido I "
                    + "inner join Pedido P on I.cod_ped = P.cod_ped where dt_emissao between ? and ? ");// Define a query do insert
            //seta os valores
            pst.setString(1, data1);
            pst.setString(2, data2);
            //executa a consulta e guarda o valor
            rs = pst.executeQuery();
            //verifica se tem registro
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    //se tiver executa o while que vai inserir os valores na variavel
                    valor = rs.getString(1);
                }
            } else {
                //se não tiver registro, retorna a mesnagem
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado");
            }
        } catch (SQLException e) {
            // Caso de erro, mostrará a mensagem junto com o erro
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: " + e.getMessage());
        } finally {
            con.fecharConn();// Fecha a conexão com o banco         
        }
        return valor;//retorna o resultado
    }

}
