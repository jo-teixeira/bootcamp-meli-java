package com.mercadolibre.starwars.repositories;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mercadolibre.starwars.response.Personagem;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StarWarsRepositoryImpl implements StarWarsRepository {

    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public List<Personagem> findByName(String name) throws Exception {


        TypeReference<List<Personagem>> typeReference = new TypeReference<>() {
        };
        File file = ResourceUtils.getFile("classpath:starwars.json");
        List<Personagem> personagens = mapper.readValue(file, typeReference);
        return personagens.stream().filter(personagem -> personagem.getName().contains(name)).collect(Collectors.toList());

    }
}
