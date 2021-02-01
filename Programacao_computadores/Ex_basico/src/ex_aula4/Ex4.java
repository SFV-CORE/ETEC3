/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex4 
{
    public static void main(String[] args)
    {
        double h;
        int i;
        h = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura 1"));
        double maior=h, menor=h ;
        
        for(i=2; i<=15; i++)
        {
            h = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura "+i));
            
            if(h>=maior)
            {
                maior = h;
            }
            else if(h<=menor)
            {
                menor = h;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Insira uma altura valida");
            }
        }
            JOptionPane.showMessageDialog(null,"maior: "+maior+"\nmenor: "+menor);
    }
}
    

