package com.example.calculadora_metro_quadrado;

import java.util.ArrayList;

public class Casa {
    private String nome;
    private String endereco;
    private ArrayList<Comodo> comodos;

    public Casa() {
    }

    @Override
    public String toString() {
        return "Casa{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", comodos=" + comodos +
                '}';
    }

    public Casa(String nome, String endereco, ArrayList<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }
}
