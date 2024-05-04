package com.filipe.springsorteio;

import java.time.LocalDate;

public class Usuario {
    private int _id;
    private boolean _consentimento;
    private LocalDate _dataNascimento;
    private String _nome;
    private String _cpf;
    private String _email;
    private String _perfil;
    private String _role;
    private String _senha;
    private String _telefone;
    private String _estado;
    private String _municipio;
    private String _cep;
    private String _bairro;
    private String _logradouro;
    private String _numero;
    private String _complemento;

    public Usuario(int id, boolean consentimento, LocalDate dataNascimento, String nome, String cpf,
                   String email, String perfil, String role, String senha,
                   String telefone, String estado, String municipio,
                   String cep, String bairro, String logradouro,
                   String numero, String complemento) {
        this._id = id;
        this._consentimento = consentimento;
        this._dataNascimento = dataNascimento;
        this._nome = nome;
        this._cpf = cpf;
        this._email = email;
        this._perfil = perfil;
        this._role = role;
        this._senha = senha;
        this._telefone = telefone;
        this._estado = estado;
        this._municipio = municipio;
        this._cep = cep;
        this._bairro = bairro;
        this._logradouro = logradouro;
        this._numero = numero;
        this._complemento = complemento;
    }
}