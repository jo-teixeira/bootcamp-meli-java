package com.meli.calculadoracalorias.response;

import com.meli.calculadoracalorias.model.Ingrediente;

import java.util.List;

public class PratoResponse {

    private String nome;

    private List<Ingrediente> ingredientes;

    private Integer caloriasTotais;

    private Ingrediente ingredienteMaisCalorico;

    public PratoResponse() {
    }

    public PratoResponse(String nome, List<Ingrediente> ingredientes, Integer caloriasTotais, Ingrediente ingredienteMaisCalorico) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.caloriasTotais = caloriasTotais;
        this.ingredienteMaisCalorico = ingredienteMaisCalorico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Integer getCaloriasTotais() {
        return caloriasTotais;
    }

    public void setCaloriasTotais(Integer caloriasTotais) {
        this.caloriasTotais = caloriasTotais;
    }

    public Ingrediente getIngredienteMaisCalorico() {
        return ingredienteMaisCalorico;
    }

    public void setIngredienteMaisCalorico(Ingrediente ingredienteMaisCalorico) {
        this.ingredienteMaisCalorico = ingredienteMaisCalorico;
    }
}
