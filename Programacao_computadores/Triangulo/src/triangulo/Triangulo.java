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
public class Triangulo {

    private String _tipo;
    private double _perimetro;
    private double _area;
    private double [] _lados = new double[3];
    
    /*
    public void set_lados(int p ,Double n){
        this._lados[p] = n; 
    }
        
    public double get_lado(int n){
        return _lados[n];
    }
*/

    public Triangulo() {
    }

    public Triangulo(String _tipo, double _perimetro, double _area, double[] _lados) {
        this._tipo = _tipo;
        this._perimetro = _perimetro;
        this._area = _area;
        this._lados = _lados;
    }

    public String get_tipo() {
        return this._tipo;
    }

    public void set_tipo(String _tipo) {
        this._tipo = _tipo;
    }

    public double get_perimetro() {
        return this._perimetro;
    }

    public void set_perimetro(double _perimetro) {
        this._perimetro = _perimetro;
    }

    public double get_area() {
        return this._area;
    }

    public void set_area(double _area) {
        this._area = _area;
    }

    public double[] get_lados() {
        return this._lados;
    }

    public void set_lados(double[] _lados) {
        this._lados = _lados;
    }

    public Triangulo _tipo(String _tipo) {
        this._tipo = _tipo;
        return this;
    }

    public Triangulo _perimetro(double _perimetro) {
        this._perimetro = _perimetro;
        return this;
    }

    public Triangulo _area(double _area) {
        this._area = _area;
        return this;
    }

    public Triangulo _lados(double[] _lados) {
        this._lados = _lados;
        return this;
    }

      
    public Boolean getIsTriangle(){
        
        Boolean rs = isTriagle();
        
        return rs;
    }
    
    public String getClassificacao(){
        String rs;
        return rs = classificar();
        
    }
    
    public double perimetro(){
        return calcularPerimetro();
    }
        
    public double calcularArea(){
        
        boolean n = isTriagle();
        if(n){
            double sp = (calcularPerimetro()/2);
            
            double rs = Math.sqrt(sp * 
                        (sp - get_lados()[0]) * 
                        (sp - get_lados()[1]) * 
                        (sp - get_lados()[2]) );
            return rs;
        }
        else{
            return 0;
        }       
    }

    private double calcularPerimetro(){
        
        double p = (get_lados()[0]  + get_lados()[1] + get_lados()[2]);
        
        set_perimetro(p);
        return p;
    }
    
    private boolean isTriagle()
    {
        if(get_lados()[2] < (get_lados()[0] + get_lados()[1]))
        {
            if(get_lados()[1] < (get_lados()[0] + get_lados()[2]))
            {
                if(get_lados()[0] < (get_lados()[1]  + get_lados()[2]))
                {
                    
                    classificar();
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

    private String classificar() {
        
        
        
        String rs;
        if(get_lados()[0]  == get_lados()[1]  && get_lados()[1] == get_lados()[2]){
            rs = "Triângulo equilátero";
            return rs;
        }
        else if(get_lados()[0]  != get_lados()[1]  && get_lados()[1] != get_lados()[2]){
            rs = "Triângulo escaleno";
            return rs;
        }
        else{
            rs =  "Triângulo isósceles";
            return rs;
        }
    }  
}
