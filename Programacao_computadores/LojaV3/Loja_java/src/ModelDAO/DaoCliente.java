/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelDAO;

import ModelBeans.BeansCliente;
import ModelConnection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class DaoCliente {
    ConexaoBD con = new ConexaoBD();// Instancia a conexão
    BeansCliente mod = new BeansCliente(); // Instancia o cliente
    
    public void Cadastrar(BeansCliente mod){
        con.Conexão();// inicia a conexão
        try{
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO Cliente(nome_clie, cep, cnpj, cidade, endereco) VALUES(?,?, ?, ?, ?)");// Define a query do insert
            pst.setString(1, mod.get_nome());// Define o primeiro valor como o nome
            pst.setString(2, mod.get_cep());// Define o segundo valor como a senha
            pst.setString(3, mod.get_cnpj());
            pst.setString(4, mod.get_cidade());
            pst.setString(5, mod.get_endereco());
            pst.execute();// Executa a query
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar o usuario!/nErro: "+e);// Caso de erro, mostrará a mensagem junto com o erro
        }
        con.fecharConn();// Fecha a conexão com o banco
    }       
}
