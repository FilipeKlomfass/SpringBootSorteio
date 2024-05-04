package com.filipe.springsorteio;

public class Bilhete {
    private int _id;
    private int _ano;
    private int _mes;
    private int _numero;
    private int _notaFiscalId;
    private int _usuarioId;

    public Bilhete(int id, int ano, int mes, int numero, int notaFiscalId, int usuarioId) {
        this._id = id;
        this._ano = ano;
        this._mes = mes;
        this._numero = numero;
        this._notaFiscalId = notaFiscalId;
        this._usuarioId = usuarioId;
    }
}