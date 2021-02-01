/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculos cal = new Calculos();
        
        try{
            String option = JOptionPane.showInputDialog("Digite qual operação deseja:\n"
                    +"A- Soma\n"
                    +"B- Subtração\n"
                    +"C- Multiplicação\n"
                    +"D- Divisão\n"
                    +"E- Raiz Quadrada\n"
                    +"F- Potência\n").toUpperCase();

            switch(option){
                case "A": 
                    float soma1 = Float.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero da soma: "));
                    float soma2 = Float.valueOf(JOptionPane.showInputDialog("Digite o segundo numero da soma: "));
                    cal.soma(soma1, soma2);
                    break;

                case "B": 
                    float sub1 = Float.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero da subtração: "));
                    float sub2 = Float.valueOf(JOptionPane.showInputDialog("Digite o segundo numero da subtração: "));
                    cal.sub(sub1, sub2);
                    break;

                case "C": 
                    float mult1 = Float.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero da multiplicação: "));
                    float mult2 = Float.valueOf(JOptionPane.showInputDialog("Digite o segundo numero da multiplicação: "));
                    cal.mult(mult1, mult2);
                    break;   

                case "D": 
                    float div1 = Float.valueOf(JOptionPane.showInputDialog("Digite o primeiro numero da divisão: "));
                    float div2 = Float.valueOf(JOptionPane.showInputDialog("Digite o segundo numero da divisão: "));
                    cal.div(div1, div2);
                    break;    

                case "E": 
                    int n1 = Integer.valueOf(JOptionPane.showInputDialog("Digite o numero que deseja encontrar a raiz quadrada: "));
                    cal.raiz(n1);
                    break;    

                case "F": 
                    float pot1 = Float.valueOf(JOptionPane.showInputDialog("Digite o numero da potência: "));
                    float pot2 = Float.valueOf(JOptionPane.showInputDialog("Digite o expoente da potência: "));
                    cal.potencia(pot1, pot2);
                    break;    

                default: 
                    JOptionPane.showMessageDialog(null, "Não foi possivel reconhecer o valor digitado, por favor tente novamente.");
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor insira somente numeros! "+e);
        }
        
        
    }
    
}
