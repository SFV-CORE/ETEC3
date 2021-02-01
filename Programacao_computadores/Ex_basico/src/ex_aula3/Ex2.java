/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula3;


import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex2 {
     public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String msn1, hex;
        
        msn1 = JOptionPane.showInputDialog("Digite um numero para converter para hex: ");
        n = Integer.parseInt(msn1);
        
        hex = Integer.toHexString(n);    
        
        JOptionPane.showMessageDialog(null, hex);
        
    }
}
