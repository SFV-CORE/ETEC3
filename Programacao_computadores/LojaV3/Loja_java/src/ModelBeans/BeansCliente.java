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


    public BeansCliente() {
    }

    public BeansCliente(String _cnpj, String _cep, String _nome, String _endereco, String _cidade) {
        this._cnpj = _cnpj;
        this._cep = _cep;
        this._nome = _nome;
        this._endereco = _endereco;
        this._cidade = _cidade;
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

    public BeansCliente _cnpj(String _cnpj) {
        this._cnpj = _cnpj;
        return this;
    }

    public BeansCliente _cep(String _cep) {
        this._cep = _cep;
        return this;
    }

    public BeansCliente _nome(String _nome) {
        this._nome = _nome;
        return this;
    }

    public BeansCliente _endereco(String _endereco) {
        this._endereco = _endereco;
        return this;
    }

    public BeansCliente _cidade(String _cidade) {
        this._cidade = _cidade;
        return this;
    }

}