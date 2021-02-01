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
public class Ex_5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        String ltempo , lvelmedia ;
        int tempo , velmedia ;
        float distancia, litros;
        
        ltempo = JOptionPane.showInputDialog("Escreva seu tempo de viagem(horas): ");
        tempo = Integer.parseInt(ltempo);
        
        lvelmedia = JOptionPane.showInputDialog("Escreva sua velocidade media: ");
        velmedia = Integer.parseInt(lvelmedia);
        
        distancia = tempo * velmedia ;
        
        litros = distancia/12;
        
        JOptionPane.showMessageDialog(null, "Resultados: \nTempo de viagem "+tempo+" Hr\nVelocidade media da viagem "+velmedia+" KM/H\nDistancia percorrida "+distancia+" KM\nLitros utilizados "+litros+" L");
        System.exit(0);
    } 
}