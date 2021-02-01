/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula1;

import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex_8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        float HT, VH, DT, PD;
        float salBruto, salLiqui, vd;
        String msn1, msn2, msn3, msn4;
        
        msn1 = JOptionPane.showInputDialog("Horas Trabalhadas: ");
        HT = Float.parseFloat(msn1);
        
        msn2 = JOptionPane.showInputDialog("Valor da Hora: ");
        VH = Float.parseFloat(msn2);
        
        msn3 = JOptionPane.showInputDialog("Dias Trabalhados: ");
        DT = Float.parseFloat(msn3);
        
        msn4 = JOptionPane.showInputDialog("Percentual de Desconto: ");
        PD = Float.parseFloat(msn4);
        
        salBruto = VH*DT*HT;
        vd = salBruto * (PD/100);
        salLiqui = salBruto-vd;
        
        JOptionPane.showMessageDialog(null,"\nSALARIO BRUTO: "+salBruto+"\nSALARIO LIQUIDO: "+salLiqui+"\nVALOR DE DESCONTO: "+vd);
        System.exit(0);
    }
    
}
