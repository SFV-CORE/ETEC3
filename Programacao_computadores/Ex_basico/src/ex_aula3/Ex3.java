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
public class Ex3 {
    public static void main(String[] args) {
        // TODO code application logic here
        double n1, n2, mdcR;
        String msn1, msn2;
        
        msn1 = JOptionPane.showInputDialog("Digite a primeira quantidade de cartas: ");
        n1 = Double.parseDouble(msn1);
        
        msn2 = JOptionPane.showInputDialog("Digite a segunda quantidade de cartas: ");
        n2 = Double.parseDouble(msn2);
   
        mdcR = mdc(n1,n2);
        
        JOptionPane.showMessageDialog(null, mdcR);
        
    }
    
    public static double mdc (double n1, double n2){
        
            if ((n1 % n2 == 0 ))
            {
                return n2;
            }
            else
            {
                return mdc(n2,(n1 % n2));
            } 
        }
}

