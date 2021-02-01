/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

/**
 *
 * @author brisado2p
 */

public class BeansPedido {
    
    private int _codPed;
    private String _prazoEntrega;
    private int _valPed;


    public BeansPedido() {
    }

    public BeansPedido(int _codPed, String _prazoEntrega, int _valPed) {
        this._codPed = _codPed;
        this._prazoEntrega = _prazoEntrega;
        this._valPed = _valPed;
    }

    public int get_codPed() {
        return this._codPed;
    }

    public void set_codPed(int _codPed) {
        this._codPed = _codPed;
    }

    public String get_prazoEntrega() {
        return this._prazoEntrega;
    }

    public void set_prazoEntrega(String _prazoEntrega) {
        this._prazoEntrega = _prazoEntrega;
    }

    public int get_valPed() {
        return this._valPed;
    }

    public void set_valPed(int _valPed) {
        this._valPed = _valPed;
    }

    public BeansPedido _codPed(int _codPed) {
        this._codPed = _codPed;
        return this;
    }

    public BeansPedido _prazoEntrega(String _prazoEntrega) {
        this._prazoEntrega = _prazoEntrega;
        return this;
    }

    public BeansPedido _valPed(int _valPed) {
        this._valPed = _valPed;
        return this;
    }
}