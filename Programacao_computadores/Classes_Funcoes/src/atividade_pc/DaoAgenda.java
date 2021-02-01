/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pc;

import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class DaoAgenda {
        Agenda age = new Agenda();
        
    public static void mostrarTudo(Agenda age){
        
        JOptionPane.showMessageDialog (null, "Dados cadastrados com sucesso!\n"
                + "Nome: "+ age.get_nome() 
                +"\nNumero: "+ age.get_telefone() 
                +"\nE-mail: "+ age.get_email()
                +"\nEndereço: "+ age.get_endreco());

    }
    
}
