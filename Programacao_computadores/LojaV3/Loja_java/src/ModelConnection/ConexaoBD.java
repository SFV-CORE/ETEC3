/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class ConexaoBD {
    
    public Statement stms; //
    public ResultSet rs; // Armazenar o resultado
    private String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // Identificar o banco de dados
    private String caminho = "jdbc:sqlserver://localhost:1433;database=loja"; // caminho do bd
    private String user = "sa"; // usuario para acesso ao bd
    private String senha = "1b3C56789"; // senha para acesso ao bd
    public Connection conn; // Realiza conexão
        
               
    public void Conexão(){
        try {
            System.setProperty("jdbc.Drivers", Driver);
            conn = DriverManager.getConnection(caminho, user, senha);// Define a url de conexão
            JOptionPane.showMessageDialog(null, "Conexão estabelecida");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se conectar: "+ ex.getMessage());
        }
            
    }
        
    public void executaSQL(String query){
        try {
            stms = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stms.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar sql: "+ ex.getMessage());
        }
    }
        
    public void fecharConn(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Conexão fechada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar: "+ ex.getMessage());
        }
    }
}