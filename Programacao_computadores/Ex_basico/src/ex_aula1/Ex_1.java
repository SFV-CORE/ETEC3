/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String msn1, msn2;
        float soma = 0, sub, mult, div, rec1, rec2;
        
        msn1 = JOptionPane.showInputDialog("Entre com o primeiro inteiro: ");
        rec1= Float.parseFloat(msn1);
        
        msn2 = JOptionPane.showInputDialog("Entre com o segundo inteiro: ");
        rec2 = Float.parseFloat(msn2);
        
        soma = rec1 + rec2 ;
        sub = rec1 - rec2;
        mult = rec1 * rec2;
        div = (rec1 / rec2);
        
        JOptionPane.showMessageDialog(null, "\nRESULTADOS\nA soma é: "+soma+" \nA subtração é: "+sub+"\nA multiplicação é: "+mult+"\nA divisão é: "+div);
        System.exit(0);
    }
    
}
