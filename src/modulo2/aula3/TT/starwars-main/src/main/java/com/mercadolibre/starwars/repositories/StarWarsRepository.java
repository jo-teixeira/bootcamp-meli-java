package com.mercadolibre.starwars.repositories;

import com.mercadolibre.starwars.response.Personagem;

import java.util.List;

public interface StarWarsRepository {

    List<Personagem> findByName(String name) throws Exception;


}
