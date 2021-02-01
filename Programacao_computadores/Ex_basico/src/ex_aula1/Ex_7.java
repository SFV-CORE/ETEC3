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
public class Ex_7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String msn;
        int celsius, farenheit;
        
        msn = JOptionPane.showInputDialog("Digite a temperatura em Farenheit para que ela seja convertida para Graus Centígrados: ");
        farenheit = Integer.parseInt(msn);
        
        celsius = (farenheit-32) *5/9;

        JOptionPane.showMessageDialog(null, "\nTemperatura em farenheit: "+farenheit+" F\nTemperatura em celsius: "+celsius+" °C");
        System.exit(0);
    }
}
