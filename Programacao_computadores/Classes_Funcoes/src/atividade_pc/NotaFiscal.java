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
public class NotaFiscal {
    
    private int _numNota;
    private String _dt_emissao;
    private int _totalNota;
    

    public NotaFiscal() {
    }

    public NotaFiscal(int _numNota, String _dt_emissao, int _totalNota) {
        this._numNota = _numNota;
        this._dt_emissao = _dt_emissao;
        this._totalNota = _totalNota;
    }

    public int get_numNota() {
        return this._numNota;
    }

    public void set_numNota(int _numNota) {
        this._numNota = _numNota;
    }

    public String get_dt_emissao() {
        return this._dt_emissao;
    }

    public void set_dt_emissao(String _dt_emissao) {
        this._dt_emissao = _dt_emissao;
    }

    public int get_totalNota() {
        return this._totalNota;
    }

    public void set_totalNota(int _totalNota) {
        this._totalNota = _totalNota;
    }

    public NotaFiscal _numNota(int _numNota) {
        this._numNota = _numNota;
        return this;
    }

    public NotaFiscal _dt_emissao(String _dt_emissao) {
        this._dt_emissao = _dt_emissao;
        return this;
    }

    public NotaFiscal _totalNota(int _totalNota) {
        this._totalNota = _totalNota;
        return this;
    }

}
