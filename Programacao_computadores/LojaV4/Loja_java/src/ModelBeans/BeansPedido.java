/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelBeans;

import java.util.Date;

/**
 *
 * @author brisado2p
 */
public class BeansPedido {

    private int _codPed;
    private String _prazoEntrega;
    private String _dt_emissao;
    private double _valTotal;
    private int _codVen;
    private String _cnpj;


    public BeansPedido() {
    }

    public BeansPedido(int _codPed, String _prazoEntrega, String _dt_emissao, double _valTotal, int _codVen, String _cnpj) {
        this._codPed = _codPed;
        this._prazoEntrega = _prazoEntrega;
        this._dt_emissao = _dt_emissao;
        this._valTotal = _valTotal;
        this._codVen = _codVen;
        this._cnpj = _cnpj;
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

    public String get_dt_emissao() {
        return this._dt_emissao;
    }

    public void set_dt_emissao(String _dt_emissao) {
        this._dt_emissao = _dt_emissao;
    }

    public double get_valTotal() {
        return this._valTotal;
    }

    public void set_valTotal(double _valTotal) {
        this._valTotal = _valTotal;
    }

    public int get_codVen() {
        return this._codVen;
    }

    public void set_codVen(int _codVen) {
        this._codVen = _codVen;
    }

    public String get_cnpj() {
        return this._cnpj;
    }

    public void set_cnpj(String _cnpj) {
        this._cnpj = _cnpj;
    }

    @Override
    public String toString() {
        return "{" +
            " _codPed='" + get_codPed() + "'" +
            ", _prazoEntrega='" + get_prazoEntrega() + "'" +
            ", _dt_emissao='" + get_dt_emissao() + "'" +
            ", _valTotal='" + get_valTotal() + "'" +
            ", _codVen='" + get_codVen() + "'" +
            ", _cnpj='" + get_cnpj() + "'" +
            "}";
    }

}
