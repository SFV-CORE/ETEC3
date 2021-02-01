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
public class Ex8 {
    public static void main(String[] args) 
    {
       // TODO code application logic here
       
       float n1, n2, n3, n4, soma;
       String msn1, msn2, msn3, msn4;
        
       msn1 = JOptionPane.showInputDialog("Digite um numero: ");
       n1 = Float.parseFloat(msn1);
       
       msn2 = JOptionPane.showInputDialog("Digite outro numero: ");
       n2 = Float.parseFloat(msn2);
       
       msn3 = JOptionPane.showInputDialog("Digite outro numero: ");
       n3 = Float.parseFloat(msn3);
       
       msn4 = JOptionPane.showInputDialog("Digite outro numero: ");
       n4 = Float.parseFloat(msn4);
       
       if(n1 > n2 && n1 > n3 && n1 > n4){
           soma = n2 + n3 + n4;
           JOptionPane.showMessageDialog(null, "A soma dos menores números é: "+soma);
       }
       else if(n2 > n3 && n2 > n4 && n2 > n1){
           soma = n1 + n3 + n4;
           JOptionPane.showMessageDialog(null, "A soma dos menores números é: "+soma);
       }
       else if(n3 > n4 && n3 > n2 && n3 > n1){
           soma = n1 + n2 + n4;
           JOptionPane.showMessageDialog(null, "A soma dos menores números é: "+soma);
       }
       else if(n4 > n3 && n4 > n2 && n4 > n1){
           soma = n1 + n2 + n4;
           JOptionPane.showMessageDialog(null, "A soma dos menores números é: "+soma);
       }
       else{
           JOptionPane.showMessageDialog(null, "Valores inválidos");
       }
       

       
    }
}
