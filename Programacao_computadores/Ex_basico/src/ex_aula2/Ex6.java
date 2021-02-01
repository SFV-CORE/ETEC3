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
public class Ex6 {
    public static void main(String[] args) {
       // TODO code application logic here
       int cod;
       String tipo;
       String msn1;
        
       msn1 = JOptionPane.showInputDialog("Digite o código do produto: ");
       cod = Integer.parseInt(msn1);
       
       switch(cod){
           case 1: tipo = "Alimento não-perecível"; 
                   JOptionPane.showMessageDialog(null, "Classificação: "+tipo);
                   break;
           case 2:
           case 3:
           case 4: tipo = "Alimento perecível"; 
                   JOptionPane.showMessageDialog(null, "Classificação: "+tipo);
                   break;
           case 5:
           case 6: tipo = "Vestuário"; 
                   JOptionPane.showMessageDialog(null, "Classificação: "+tipo);
                   break;
           case 7: tipo = "Higiene pessoal"; 
                   JOptionPane.showMessageDialog(null, "Classificação: "+tipo);
                   break;
           case 8:
           case 9:   
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15: tipo = "Limpeza e utensílios domésticos"; 
                    JOptionPane.showMessageDialog(null, "Classificação: "+tipo);
                    break;
           default: JOptionPane.showMessageDialog(null, "Código invalido");
                    break;
       }
       
    }
}
