/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author 55119
 */
public class Ex4 {
    
    public static void main(String[] args) 
    {
       // TODO code application logic here
       double sal, presta, comp;
       String msn1,msn2;
        
       msn1 = JOptionPane.showInputDialog("Digite seu salário: ");
       sal = Double.parseDouble(msn1);
       
       msn2 = JOptionPane.showInputDialog("Digite o valor da prestação: ");
       presta = Double.parseDouble(msn2);
       
       comp = sal * 0.20;
       
       if (presta > comp)
       {
           JOptionPane.showMessageDialog(null, "Empréstimo não aprovado");
       }
       else 
       {
            JOptionPane.showMessageDialog(null, "Empréstimo aprovado, Parabéns!!");   
       }
    }
}
