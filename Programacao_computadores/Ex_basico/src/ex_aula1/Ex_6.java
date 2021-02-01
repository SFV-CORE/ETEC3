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
public class Ex_6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String msn;
        float celsius, farenheit;
        
        msn = JOptionPane.showInputDialog("Digite a temperatura em Celsius para que ela seja convertida para Farenheit: ");
        celsius = Float.parseFloat(msn);
        
        farenheit = (9*celsius+160)/5 ;
        
        JOptionPane.showMessageDialog(null, "\nTemperatura em celsius: "+celsius+" °C\nTemperatura em farenheit: "+farenheit+" F");
        System.exit(0);
    }
}
