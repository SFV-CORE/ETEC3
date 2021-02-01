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

public class BeansVendedores {
    
    private int _codVend;
    private String _nomeVend;
    private String _comissao;
    private String _salFixo;


    public BeansVendedores() {
    }

    public BeansVendedores(int _codVend, String _nomeVend, String _comissao, String _salFixo) {
        this._codVend = _codVend;
        this._nomeVend = _nomeVend;
        this._comissao = _comissao;
        this._salFixo = _salFixo;
    }

    public int get_codVend() {
        return this._codVend;
    }

    public void set_codVend(int _codVend) {
        this._codVend = _codVend;
    }

    public String get_nomeVend() {
        return this._nomeVend;
    }

    public void set_nomeVend(String _nomeVend) {
        this._nomeVend = _nomeVend;
    }

    public String get_comissao() {
        return this._comissao;
    }

    public void set_comissao(String _comissao) {
        this._comissao = _comissao;
    }

    public String get_salFixo() {
        return this._salFixo;
    }

    public void set_salFixo(String _salFixo) {
        this._salFixo = _salFixo;
    }

    public BeansVendedores _codVend(int _codVend) {
        this._codVend = _codVend;
        return this;
    }

    public BeansVendedores _nomeVend(String _nomeVend) {
        this._nomeVend = _nomeVend;
        return this;
    }

    public BeansVendedores _comissao(String _comissao) {
        this._comissao = _comissao;
        return this;
    }

    public BeansVendedores _salFixo(String _salFixo) {
        this._salFixo = _salFixo;
        return this;
    }
}