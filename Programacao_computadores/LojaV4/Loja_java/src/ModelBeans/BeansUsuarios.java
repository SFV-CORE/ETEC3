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

    private int _codUser;
    private String _nome;
    private String _senha;
    private int _adm;
    private int _codVen;

    public BeansUsuarios() {
    }

    public BeansUsuarios(int _codUser, String _nome, String _senha, int _adm, int _codVen) {
        this._codUser = _codUser;
        this._nome = _nome;
        this._senha = _senha;
        this._adm = _adm;
        this._codVen = _codVen;
    }

    public int get_codUser() {
        return this._codUser;
    }

    public void set_codUser(int _codUser) {
        this._codUser = _codUser;
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

    public int get_adm() {
        return this._adm;
    }

    public void set_adm(int _adm) {
        this._adm = _adm;
    }

    public int get_codVen() {
        return this._codVen;
    }

    public void set_codVen(int _codVen) {
        this._codVen = _codVen;
    }

    @Override
    public String toString() {
        return "{"
                + " _codUser='" + get_codUser() + "'"
                + ", _nome='" + get_nome() + "'"
                + ", _senha='" + get_senha() + "'"
                + ", _adm='" + get_adm() + "'"
                + ", _codVen='" + get_codVen() + "'"
                + "}";
    }

}
