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
public class Ex7 {
   
    public static void main(String[] args) 
    {
       // TODO code application logic here
       
       int nr;
       String msn1;
        
       msn1 = JOptionPane.showInputDialog("Digite o número para saber se é divísivel por 5 ou 3: ");
       nr = Integer.parseInt(msn1);
        
       if(nr%5 == 0 && nr%3 == 0)
       {
           JOptionPane.showMessageDialog(null, "O numero"+nr+" é divisivel por 5 e 3");
       }
       else
       {
           JOptionPane.showMessageDialog(null, "O numero"+nr+" não é divisivel por 5 e 3");
       }
    }
}
