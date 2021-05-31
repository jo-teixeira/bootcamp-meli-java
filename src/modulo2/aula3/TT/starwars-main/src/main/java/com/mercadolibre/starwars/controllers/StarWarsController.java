package com.mercadolibre.starwars.controllers;


import com.mercadolibre.starwars.response.Personagem;
import com.mercadolibre.starwars.services.StarWarsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/personagem")
public class StarWarsController {

    private StarWarsService starWarsService;

    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }

    @GetMapping
    ResponseEntity<List<Personagem>> buscarPersonagens(@RequestParam String nome) throws Exception {
        List<Personagem> personagens = starWarsService.encontrarPersonagens(nome);
        return ResponseEntity.ok(personagens);
    }
}
