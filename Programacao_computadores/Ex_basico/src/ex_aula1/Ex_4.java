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
public class Ex_4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String sal1;
        float sal2 ;
        float aumento ;
        
        
        sal1 = JOptionPane.showInputDialog("Digite o Salario");
        sal2 = Float.parseFloat(sal1);
           
        aumento = sal2 + (sal2*15/100) ;
        
        JOptionPane.showMessageDialog(null,"Reajuste: "+aumento);
            
        System.exit(0);
    }
}
