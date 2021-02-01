/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author 55119
 */
public class Ex5 {
    public static void main(String[] args) 
    {
        String alt, sexo;
        double h, resultado, sexo1;
        
        alt = JOptionPane.showInputDialog("Digite sua altura\nColoque ponto no lugar da vírgula: ");
        h = Double.parseDouble(alt);
        
        sexo = JOptionPane.showInputDialog("Digite seu sexo:\n 1 para feminino\n2 para Masculino\n");
        sexo1 = Double.parseDouble(sexo);
        
        if(sexo1 == 1){
           resultado = (62.1 * h) - 44.7;
           JOptionPane.showMessageDialog(null,"Seu peso ideal "+resultado);
        }
        else if(sexo1 == 2){
            resultado = (72.7 * h) - 58; 
            JOptionPane.showMessageDialog(null,"Seu peso ideal "+resultado);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Comando não reconhecido");
        }

    }    
}
