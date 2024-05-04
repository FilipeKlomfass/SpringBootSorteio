package com.filipe.springsorteio;

import java.time.LocalDate;

public class NotaFiscal {
    private int _id;
    private int _usuarioId;
    private String _chave;
    private String _sequencial;
    private LocalDate _dataProcessamento;

    public NotaFiscal(int id, int usuarioId, String chave, String sequencial, LocalDate dataProcessamento) {
        this._id = id;
        this._usuarioId = usuarioId;
        this._chave = chave;
        this._sequencial = sequencial;
        this._dataProcessamento = dataProcessamento;
    }
}
