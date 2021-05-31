package com.mercadolibre.starwars.services;

import com.mercadolibre.starwars.repositories.StarWarsRepository;
import com.mercadolibre.starwars.response.Personagem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarWarsService {

    private StarWarsRepository starWarsRepository;

    public StarWarsService(StarWarsRepository starWarsRepository) {
        this.starWarsRepository = starWarsRepository;
    }

    public List<Personagem> encontrarPersonagens(String nome) throws Exception {
        return starWarsRepository.findByName(nome);
    }


}
