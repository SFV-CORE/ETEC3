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
public class BeansCliente {

    private String _cnpj;
    private String _cep;
    private String _nome;
    private String _endereco;
    private String _cidade;
    private int _codClie;
    private String _uf;
    private int _ativo;


    public BeansCliente() {
    }

    public int getAtivo() {
        return _ativo;
    }

    public void setAtivo(int _ativo) {
        this._ativo = _ativo;
    }


    public String get_cnpj() {
        return this._cnpj;
    }

    public void set_cnpj(String _cnpj) {
        this._cnpj = _cnpj;
    }

    public String get_cep() {
        return this._cep;
    }

    public void set_cep(String _cep) {
        this._cep = _cep;
    }

    public String get_nome() {
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_endereco() {
        return this._endereco;
    }

    public void set_endereco(String _endereco) {
        this._endereco = _endereco;
    }

    public String get_cidade() {
        return this._cidade;
    }

    public void set_cidade(String _cidade) {
        this._cidade = _cidade;
    }

    public int get_codClie() {
        return this._codClie;
    }

    public void set_codClie(int _codClie) {
        this._codClie = _codClie;
    }

    public String get_uf() {
        return this._uf;
    }

    public void set_uf(String _uf) {
        this._uf = _uf;
    }

    @Override
    public String toString() {
        return "{" +
            " _cnpj='" + get_cnpj() + "'" +
            ", _cep='" + get_cep() + "'" +
            ", _nome='" + get_nome() + "'" +
            ", _endereco='" + get_endereco() + "'" +
            ", _cidade='" + get_cidade() + "'" +
            ", _codClie='" + get_codClie() + "'" +
            ", _uf='" + get_uf() + "'" +
            "}";
    }
 

}
