package com.meli.calculadoracalorias.service;

import com.meli.calculadoracalorias.model.Ingrediente;
import com.meli.calculadoracalorias.repository.IngredienteRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class IngredienteService {

    private IngredienteRepository ingredienteRepository;

    public IngredienteService(IngredienteRepository ingredienteRepository) {
        this.ingredienteRepository = ingredienteRepository;
    }

    public List<Ingrediente> buscarIngredientesPorIngredienteRequest(List<String> ingredienteNomes) {
        return ingredienteRepository.findByNomes(ingredienteNomes);
    }

    public Integer totalDeCalorias(List<Ingrediente> ingredientes) {
        return ingredientes.stream().mapToInt(Ingrediente::getCalories).sum();
    }

    public Ingrediente ingredienteMaisCalorico(List<Ingrediente> ingredientes) {
        return Collections.max(ingredientes, Comparator.comparing(Ingrediente::getCalories));
    }


}
