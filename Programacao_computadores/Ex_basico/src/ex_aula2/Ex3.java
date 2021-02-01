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
public class Ex3 
{
    public static void main(String[] args) 
    {
       // TODO code application logic here
       double n1, n2;
       String msn1,msn2;
        
       msn1 = JOptionPane.showInputDialog("Digite um número: ");
       n1 = Double.parseDouble(msn1);
       
       msn2 = JOptionPane.showInputDialog("Digite outro número: ");
       n2 = Double.parseDouble(msn2);
       
       JOptionPane.showMessageDialog(null, "Maior número: "+Math.max(n1,n2)+"\nMenor número: "+Math.min(n1, n2));
    }
}
