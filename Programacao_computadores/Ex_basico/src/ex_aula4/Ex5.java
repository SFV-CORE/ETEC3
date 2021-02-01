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
public class Ex5 {
    public static void main(String[] args){
        double n, soma=0, media, centoMenor, centoMaior, x=0;
        int i=0, maior=0, menor=0;
        
        do{
           n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número. Digite 999 para sair"));
           if(n!= 999){
            soma += n;
            i++;
            
            if(n > 0){
               maior ++;
               }
            else if(n<0){
                menor++;
                }
            
           }
           
            }while(n!=999);

        media = soma/i;
        
        x=i;
        
        centoMenor = (menor/x)*100;
        centoMaior = (maior/x)*100;
        
        JOptionPane.showMessageDialog(null, media);
        JOptionPane.showMessageDialog(null, "A quantidade de positivos é: " + maior + "\n A quantidade de negativos é: " + menor + "\nPorcentagem positivo: " + centoMaior + "%\n Porcentagem negativo: " + centoMenor +"%");
    }
    
}
