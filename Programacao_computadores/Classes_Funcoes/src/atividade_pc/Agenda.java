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
public class Agenda {
    
    private String _nome;
    private String _endreco;
    private int _telefone;
    private String _email;
    

    public Agenda() {
    }

    public Agenda(String _nome, String _endreco, int _telefone, String _email) {
        this._nome = _nome;
        this._endreco = _endreco;
        this._telefone = _telefone;
        this._email = _email;
    }

    public String get_nome() {
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_endreco() {
        return this._endreco;
    }

    public void set_endreco(String _endreco) {
        this._endreco = _endreco;
    }

    public int get_telefone() {
        return this._telefone;
    }

    public void set_telefone(int _telefone) {
        this._telefone = _telefone;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public Agenda _nome(String _nome) {
        this._nome = _nome;
        return this;
    }

    public Agenda _endreco(String _endreco) {
        this._endreco = _endreco;
        return this;
    }

    public Agenda _telefone(int _telefone) {
        this._telefone = _telefone;
        return this;
    }

    public Agenda _email(String _email) {
        this._email = _email;
        return this;
    }

    
}
