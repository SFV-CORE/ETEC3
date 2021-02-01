/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import javax.swing.JOptionPane;

/**
 *
 * @author brisado2p
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Triangulo tri = new Triangulo();
        
        double [] n = new double[3];

        
        n[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro lado: "));
        n[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segudo lado: "));
        n[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro lado: "));
        
        tri.set_lados(n);
        
        if(tri.getIsTriangle()){
            
            String cla = tri.getClassificacao();
            double p = tri.perimetro();
            double area = tri.calcularArea();
            JOptionPane.showMessageDialog(null, "Lado 1: " + tri.get_lados()[0] 
                    + "\nLado 2: " + tri.get_lados()[1]
                    + "\nLado 3: " + tri.get_lados()[2]
                    + "\nClassificação: "+ cla
                    + "\nPerímetro: "+p
                    + "\nÁrea: "+area);
        }
        else{
            JOptionPane.showMessageDialog(null, "Valores inseridos não formam um triângulo!");
        }
    }
    
}
