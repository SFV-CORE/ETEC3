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
public class BeansProdutos {

    private int _codProd;
    private String _nome_prod;
    private int _unidade;
    private String _descricao;
    private double _valUnit;
    private int _ativo;


    public BeansProdutos() {
    }

    public BeansProdutos(int _codProd, String _nome_prod, int _unidade, String _descricao, double _valUnit) {
        this._codProd = _codProd;
        this._nome_prod = _nome_prod;
        this._unidade = _unidade;
        this._descricao = _descricao;
        this._valUnit = _valUnit;
    }

    public int getAtivo() {
        return _ativo;
    }

    public void setAtivo(int _ativo) {
        this._ativo = _ativo;
    }

    public int get_codProd() {
        return this._codProd;
    }

    public void set_codProd(int _codProd) {
        this._codProd = _codProd;
    }

    public String get_nome_prod() {
        return this._nome_prod;
    }

    public void set_nome_prod(String _nome_prod) {
        this._nome_prod = _nome_prod;
    }

    public int get_unidade() {
        return this._unidade;
    }

    public void set_unidade(int _unidade) {
        this._unidade = _unidade;
    }

    public String get_descricao() {
        return this._descricao;
    }

    public void set_descricao(String _descricao) {
        this._descricao = _descricao;
    }

    public double get_valUnit() {
        return this._valUnit;
    }

    public void set_valUnit(double _valUnit) {
        this._valUnit = _valUnit;
    }

    @Override
    public String toString() {
        return "{" +
            " _codProd='" + get_codProd() + "'" +
            ", _nome_prod='" + get_nome_prod() + "'" +
            ", _unidade='" + get_unidade() + "'" +
            ", _descricao='" + get_descricao() + "'" +
            ", _valUnit='" + get_valUnit() + "'" +
            "}";
    }

}
