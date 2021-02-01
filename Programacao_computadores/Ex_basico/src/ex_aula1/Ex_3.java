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
public class Ex_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String msn1, msn2;
        float n1, n2, medi;
        
        msn1 = JOptionPane.showInputDialog("Entre com o primeiro inteiro: ");
        n1= Float.parseFloat(msn1);
        
        msn2 = JOptionPane.showInputDialog("Entre com o segundo inteiro: ");
        n2 = Float.parseFloat(msn2);
  
        medi = (n1 + n2)/2 ;
        
        JOptionPane.showMessageDialog(null, " "+medi, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
