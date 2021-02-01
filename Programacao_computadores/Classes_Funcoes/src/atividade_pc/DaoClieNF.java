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
public class DaoClieNF {
    Cliente clie = new Cliente();
    NotaFiscal nf = new NotaFiscal();
    
    public static void mostrarNota(Cliente clie, NotaFiscal nf){
        
        JOptionPane.showMessageDialog (null, "Dados cadastrados com sucesso!\n"
                + "Numero da Nota Fiscal: "+ nf.get_numNota()
                + "\nNome do Cliente: "+ clie.get_noome() 
                + "\nCPF: "+ clie.get_cpf()
                + "\nE-mail: "+ clie.get_email()
                + "\nData de emissão: "+ nf.get_dt_emissao()
                + "\nValor total: "+ nf.get_totalNota());
    }
    
}
