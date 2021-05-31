package com.meli.calculadoracalorias.repository;

import com.meli.calculadoracalorias.model.Ingrediente;

import java.util.List;

public interface IngredienteRepository {

    List<Ingrediente> findAll();

    List<Ingrediente> findByNomes(List<String> nomes);
}
