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
    private int _qntd;
    private String _descricao;
    private int _valor;


    public BeansProdutos() {
    }

    public BeansProdutos(int _codProd, int _qntd, String _descricao, int _valor) {
        this._codProd = _codProd;
        this._qntd = _qntd;
        this._descricao = _descricao;
        this._valor = _valor;
    }

    public int get_codProd() {
        return this._codProd;
    }

    public void set_codProd(int _codProd) {
        this._codProd = _codProd;
    }

    public int get_qntd() {
        return this._qntd;
    }

    public void set_qntd(int _qntd) {
        this._qntd = _qntd;
    }

    public String get_descricao() {
        return this._descricao;
    }

    public void set_descricao(String _descricao) {
        this._descricao = _descricao;
    }

    public int get_valor() {
        return this._valor;
    }

    public void set_valor(int _valor) {
        this._valor = _valor;
    }

    public BeansProdutos _codProd(int _codProd) {
        this._codProd = _codProd;
        return this;
    }

    public BeansProdutos _qntd(int _qntd) {
        this._qntd = _qntd;
        return this;
    }

    public BeansProdutos _descricao(String _descricao) {
        this._descricao = _descricao;
        return this;
    }

    public BeansProdutos _valor(int _valor) {
        this._valor = _valor;
        return this;
    }
}