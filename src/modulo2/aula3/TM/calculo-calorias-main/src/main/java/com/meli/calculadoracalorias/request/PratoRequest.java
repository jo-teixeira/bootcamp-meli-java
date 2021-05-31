package com.meli.calculadoracalorias.request;

import java.util.List;

public class PratoRequest {

    private String nome;

    private List<String> ingredientes;

    public PratoRequest() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredienteRequests) {
        this.ingredientes = ingredienteRequests;
    }
}
