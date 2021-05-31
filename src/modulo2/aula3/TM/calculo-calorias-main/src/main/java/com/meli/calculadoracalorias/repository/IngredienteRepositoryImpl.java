package com.meli.calculadoracalorias.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.calculadoracalorias.model.Ingrediente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class IngredienteRepositoryImpl implements IngredienteRepository {

    @Autowired
    private ObjectMapper mapper = new ObjectMapper();

    public List<Ingrediente> findAll() {
        TypeReference<List<Ingrediente>> typeReference = new TypeReference<>() {
        };
        File file = null;
        try {
            file = ResourceUtils.getFile("classpath:json/food.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            return mapper.readValue(file, typeReference);
        } catch (IOException e) {
            return null;
        }
    }

    public List<Ingrediente> findByNomes(List<String> nomes) {
        List<Ingrediente> todosIngredientes = findAll();
        return todosIngredientes.stream().filter(elem -> nomes.contains(elem.getName())).collect(Collectors.toList());
    }
}
