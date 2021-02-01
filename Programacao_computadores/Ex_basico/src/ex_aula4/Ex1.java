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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1;
        for(n1=1000; n1<=1999; n1++){
           if(n1%11==5){
              JOptionPane.showMessageDialog(null, n1);
           } 
        }
    }
    
}
