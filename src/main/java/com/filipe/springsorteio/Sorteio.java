package com.filipe.springsorteio;

import java.util.ArrayList;
import java.util.List;

public class Sorteio {
    private int _id;
    private int _ano;
    private int _identificador;
    private int _mes;
    private double _valorPremio;
    private int _apresentador;
    private int _auditor;
    private int _premiado;
    private String _descricao;
    private String _tipo;
    private List<Bilhete> _bilhetes;

    public Sorteio(int id, int ano, int identificador, int mes, double valorPremio, int apresentador,
                   int auditor, int premiado, String descricao, String tipo) {
        this._id = id;
        this._ano = ano;
        this._identificador = identificador;
        this._mes = mes;
        this._valorPremio = valorPremio;
        this._apresentador = apresentador;
        this._auditor = auditor;
        this._premiado = premiado;
        this._descricao = descricao;
        this._tipo = tipo;
        this._bilhetes = new ArrayList<Bilhete>();
    }
}