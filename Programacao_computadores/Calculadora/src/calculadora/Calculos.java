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
public class Calculos {
    
    public static void mult(float n1, float n2)
    {
        float n3;
        n3= n1 * n2;
        resultado("Multiplicação", n1, n2, n3);  
    }
    
    public static void soma(float n1, float n2)
    {
        float n3;
        n3= n1 + n2;
        resultado("Soma", n1, n2, n3); 
    }
    
    public static void sub(float n1, float n2)
    {
        float n3;
        n3= n1 - n2;
        resultado("Subtração", n1, n2, n3); 
    }
    
    public static void div(float n1, float n2)
    {
        float n3;
        n3= n1 / n2;
        resultado("Divisão", n1, n2, n3);  
    }
    
    public static void potencia(float n1, float n2)
    {
        float n3;
        n3= (float) Math.pow(n1, n2);
        resultado("Potencia", n1, n2, n3);   
    }
    
    public static void raiz(int n1)
    {
        int n3;
        n3= (int) Math.sqrt(n1);
        resultado("Raiz Quadrada", n1, 0, n3);  
    }
    
    public static void resultado(String operacao, float n1, float n2, float resultado){
        if(operacao.equals("Raiz Quadrada")){
            JOptionPane.showMessageDialog(null, 
                "------------------------------------------------------------------------------------\n"
                +"O resultado da " + operacao + " de " + n1
                +" é: " + resultado
                +"\n------------------------------------------------------------------------------------");
        }
        else{
        JOptionPane.showMessageDialog(null,
                "------------------------------------------------------------------------------------\n"
                +"O resultado da " + operacao + " de " + n1 + " e " + n2
                +" é: " + resultado
                +"\n------------------------------------------------------------------------------------");
        }
        
    }
}
