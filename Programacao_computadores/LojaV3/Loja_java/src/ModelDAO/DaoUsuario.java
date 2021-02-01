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

/**
 *
 * @author brisado2p
 */
public class DaoUsuario {
    
    ConexaoBD con = new ConexaoBD();// Instancia a conexão
    BeansUsuarios mod = new BeansUsuarios(); // Instancia o usuario
    
    public void Cadastrar(BeansUsuarios mod){
        con.Conexão();// inicia a conexão
        try{
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Usuario(nm_user, senha) VALUES(?,?)");// Define a query do insert
            pst.setString(1, mod.get_nome());// Define o primeiro valor como o nome
            pst.setString(2, mod.get_senha());// Define o segundo valor como a senha
            pst.execute();// Executa a query
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o usuario!/nErro: "+e);// Caso de erro, mostrará a mensagem junto com o erro
        }
        con.fecharConn();// Fecha a conexão com o banco
    }       
}
