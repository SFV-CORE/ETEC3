/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_aula3;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto, cypher, cypher2, cypherf;
        
        texto = JOptionPane.showInputDialog("Digite o texto: ");
        
        cypher = criptografa1(texto, 3);
        cypher2 = criptografa2(cypher);
        cypherf = criptografa3(cypher2, 1);
        JOptionPane.showMessageDialog(null, cypherf);
        
    }
     public static String criptografa1 (String texto, int chave){
           
          StringBuilder textoCifrado = new StringBuilder();
           
          int tamanhoTexto = texto.length();
           
          for(int c=0; c < tamanhoTexto; c++){
              
             int letraCifradaASCII = ((int) texto.charAt(c)) + chave;//letra q vai substituir
               
             if (texto.charAt(c) > 97 && texto.charAt(c) <  125 ) {
                 while (letraCifradaASCII > 125) {
                     letraCifradaASCII = 97; }
             }
             if (texto.charAt(c) >= 65 && texto.charAt(c) <=  93 ) {
                 while (letraCifradaASCII > 93) {
                     letraCifradaASCII = 65;
                  }
             }
 
           textoCifrado.append( (char)letraCifradaASCII );
          }  
           
          return textoCifrado.toString();
    } 
     
    public static String criptografa2 (String texto){
        
        StringBuffer invertido = new StringBuffer(texto);
        invertido.reverse();
        return invertido.toString();
    }
    
     public static String criptografa3 (String texto, int chave){
           
          StringBuilder textoCifrado = new StringBuilder();
           
          int tamanhoTexto = texto.length();
           
          for(int c=0; c < tamanhoTexto; c++){
              
             int letraCifradaASCII = ((int) texto.charAt(c)) - chave;//letra q vai substituir
               
             if (texto.charAt(c) > 97 && texto.charAt(c) <  125 ) {
                 while (letraCifradaASCII > 125) {
                     letraCifradaASCII = 97; }
             }
             if (texto.charAt(c) >= 65 && texto.charAt(c) <=  93 ) {
                 while (letraCifradaASCII > 93) {
                     letraCifradaASCII = 65;
                  }
             }
 
           textoCifrado.append( (char)letraCifradaASCII );
          }  
           
          return textoCifrado.toString();
    }
    
}
