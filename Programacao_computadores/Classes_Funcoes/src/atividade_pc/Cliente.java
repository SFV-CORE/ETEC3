/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_pc;

/**
 *
 * @author brisado2p
 */
public class Cliente {
    
    private int _cpf;
    private String _noome;
    private String _email;
    

    public Cliente() {
    }

    public Cliente(int _cpf, String _noome, String _email) {
        this._cpf = _cpf;
        this._noome = _noome;
        this._email = _email;
    }

    public int get_cpf() {
        return this._cpf;
    }

    public void set_cpf(int _cpf) {
        this._cpf = _cpf;
    }

    public String get_noome() {
        return this._noome;
    }

    public void set_noome(String _noome) {
        this._noome = _noome;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public Cliente _cpf(int _cpf) {
        this._cpf = _cpf;
        return this;
    }

    public Cliente _noome(String _noome) {
        this._noome = _noome;
        return this;
    }

    public Cliente _email(String _email) {
        this._email = _email;
        return this;
    }

    
}
