/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex_2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String msn1;
        int anos, dias, mes;
        
        msn1 = JOptionPane.showInputDialog("Quantos anos você tem? ");
        anos= Integer.parseInt(msn1);
        
        dias = anos*365;
        mes = dias/30;       
        
        JOptionPane.showMessageDialog(null, "Idade: "+anos+"\nDias: "+dias+"\nMeses: "+mes,"Resultado",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
