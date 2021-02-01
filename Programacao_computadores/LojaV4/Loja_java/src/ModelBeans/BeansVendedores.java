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
    private String _nome;
    private double _comissao;
    private double _salFixo;
    private int _ativo;

    public BeansVendedores() {
    }

    public int getCodVend() {
        return _codVend;
    }

    public void setCodVend(int _codVend) {
        this._codVend = _codVend;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String _nome) {
        this._nome = _nome;
    }

    public double getComissao() {
        return _comissao;
    }

    public void setComissao(double _comissao) {
        this._comissao = _comissao;
    }

    public double getSalFixo() {
        return _salFixo;
    }

    public void setSalFixo(double _salFixo) {
        this._salFixo = _salFixo;
    }

    public int getAtivo() {
        return _ativo;
    }

    public void setAtivo(int _ativo) {
        this._ativo = _ativo;
    }

    

}
