/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Ex6 {
    public static void main(String[] args)
    {
        int n, t1=0, t2=0, t3=0, t4=0, x=0;
        
        do
        {
           n = Integer.parseInt(JOptionPane.showInputDialog("Informe um número. Digite um valor negativo para sair"));
           if(n > 0)
           {
               if( n >= 0 && n <= 25)
                   t1 += 1;
               else if(n >= 26 && n <= 50)
                   t2 += 1; 
               else if(n >= 51 && n <= 75)
                   t3 += 1; 
               else if(n >= 76 && n <= 100)
                   t4 += 1; 
           }
        }while(n > 0);
        
        JOptionPane.showMessageDialog(null, "A quantidade de numeros entre 0-25 é: " + t1 + "\nA quantidade de numeros entre 26-50 é: " + t2 + "\nA quantidade de numeros entre 51-75 é: " + t3 + "\nA quantidade de numeros entre 76-100 é: "+ t4);
    }
}
