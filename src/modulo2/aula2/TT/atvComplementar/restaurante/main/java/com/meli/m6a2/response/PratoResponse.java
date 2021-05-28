package com.meli.m6a2.response;

public class PratoResponse {

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public PratoResponse() {}

    public PratoResponse(String descricao) {
        this.descricao = descricao;
    }
}
