/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author Victor
 */
public class BeansItemPedido {
    
    private int _quant;
    private int _codPed;
    private int _codProd;


    public BeansItemPedido() {
    }

    public BeansItemPedido(int _quant, int _codPed, int _codProd) {
        this._quant = _quant;
        this._codPed = _codPed;
        this._codProd = _codProd;
    }

    public int get_quant() {
        return this._quant;
    }

    public void set_quant(int _quant) {
        this._quant = _quant;
    }

    public int get_codPed() {
        return this._codPed;
    }

    public void set_codPed(int _codPed) {
        this._codPed = _codPed;
    }

    public int get_codProd() {
        return this._codProd;
    }

    public void set_codProd(int _codProd) {
        this._codProd = _codProd;
    }

    @Override
    public String toString() {
        return "{" +
            " _quant='" + get_quant() + "'" +
            ", _codPed='" + get_codPed() + "'" +
            ", _codProd='" + get_codProd() + "'" +
            "}";
    }

}
