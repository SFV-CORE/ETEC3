package atividade_pc;



public class Pessoa{

    private String _nome = "Jack";
    private String _dt_nascimento = "11/02/2001";
    private int _altura = 170;


    public Pessoa() {
    }

    public Pessoa(String _nome, String _dt_nascimento, int _altura) {
        this._nome = _nome;
        this._dt_nascimento = _dt_nascimento;
        this._altura = _altura;
    }

    public String get_nome() {
        return this._nome;
    }

    public void set_nome(String _nome) {
        this._nome = _nome;
    }

    public String get_dt_nascimento() {
        return this._dt_nascimento;
    }

    public void set_dt_nascimento(String _dt_nascimento) {
        this._dt_nascimento = _dt_nascimento;
    }

    public int get_altura() {
        return this._altura;
    }

    public void set_altura(int _altura) {
        this._altura = _altura;
    }

    public Pessoa _nome(String _nome) {
        this._nome = _nome;
        return this;
    }

    public Pessoa _dt_nascimento(String _dt_nascimento) {
        this._dt_nascimento = _dt_nascimento;
        return this;
    }

    public Pessoa _altura(int _altura) {
        this._altura = _altura;
        return this;
    }


}