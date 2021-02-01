/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex3 {
    public static void main(String[] args) {
       int i;
       int soma = 0;
       
       for(i=1; i<=500; i++){
           if(i%2!=0 && i%3==0){
                   soma=+i;
           }
           
       }
        JOptionPane.showMessageDialog(null, "Resultado: "+soma);
    }
}
