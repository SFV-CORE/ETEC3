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
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       float a, b, c, d;
       String msn1, msn2;
        
       msn1 = JOptionPane.showInputDialog("Digite um valor: ");
       a = Float.parseFloat(msn1);
        
       msn2 = JOptionPane.showInputDialog("Digite outro valor: ");
       b = Float.parseFloat(msn2);

       c = a;
       d = b;
       
       a = d;
       b = c;
       
       JOptionPane.showMessageDialog(null, "Valor de a: "+a+"\nValor de b: "+b);
    }
}
