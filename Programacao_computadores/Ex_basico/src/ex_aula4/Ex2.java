/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula4;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Aluno
 */
public class Ex2 {
    
    public static void main(String[] args) {
        Random rnd =  new Random();
        int n = rnd.nextInt(100);
        int i, text = 0;
        String msn1;
        
        for(i = 0; text != n; i++){
            
          msn1 = JOptionPane.showInputDialog(null, "Tente acertar o numero: ");
          text = Integer.parseInt(msn1);
          
          if(text>n){
              JOptionPane.showMessageDialog(null,"Numero maior, tente novamente\n");
          }
          else if(text<n){
              JOptionPane.showMessageDialog(null,"Numero menor, tente novamente\n");
          }
        }
        JOptionPane.showMessageDialog(null,"Parabéns você acertou o numero: "+n+"\n");
    }
   
}
