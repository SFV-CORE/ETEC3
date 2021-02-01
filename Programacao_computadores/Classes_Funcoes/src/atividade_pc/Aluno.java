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
public class Aluno {
    private String nome = "Victor Guilherme Ferreira Soares";
    private String curso = "Programação de Computadores 3AI";
    private String nota = "MB";
    

    public Aluno() {
    }

    public Aluno(String nome, String curso, String nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNota() {
        return this.nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Aluno nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Aluno curso(String curso) {
        this.curso = curso;
        return this;
    }

    public Aluno nota(String nota) {
        this.nota = nota;
        return this;
    }

    
}
