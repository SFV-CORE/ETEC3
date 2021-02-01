/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class NewClass {
    public static void main(String[] args) {
       // TODO code application logic here
       float dias, fmax;
       float pf;
       String msn1;
        
       msn1 = JOptionPane.showInputDialog("Digite os dias letivos: ");
       dias = Integer.parseInt(msn1);
        
       pf = 75/100;
       fmax = dias - (dias * 75/100);
       
       JOptionPane.showMessageDialog(null, "Dias letivos: "+dias+"\nMaxímo de faltas: "+fmax);
    }
}
