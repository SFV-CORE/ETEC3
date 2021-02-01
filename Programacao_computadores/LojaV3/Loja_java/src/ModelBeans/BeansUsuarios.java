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

public class BeansUsuarios {
    
    private String _nome;
    private String _senha;
    private String _email;


    public BeansUsuarios() {
    }

    public BeansUsuarios(String _nome, String _senha, String _email) {
        this._nome = _nome;
        this._senha = _senha;
        this._email = _email;
    }

    public String get_nome() {
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_senha() {
        return this._senha;
    }

    public void set_senha(String _senha) {
        this._senha = _senha;
    }

    public String get_email() {
        return this._email;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public BeansUsuarios _nome(String _nome) {
        this._nome = _nome;
        return this;
    }

    public BeansUsuarios _senha(String _senha) {
        this._senha = _senha;
        return this;
    }

    public BeansUsuarios _email(String _email) {
        this._email = _email;
        return this;
    }


}