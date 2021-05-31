package com.mercadolibre.bootcamp.controllers;

import com.mercadolibre.bootcamp.dtos.ProdutoDTO;
import com.mercadolibre.bootcamp.models.Produto;
import com.mercadolibre.bootcamp.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {

    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> get() {
        return ResponseEntity.ok(produtoService.findAllByIds(Arrays.asList(1, 2)));
    }

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody @Valid ProdutoDTO produtoDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.create(produtoDTO));
    }
}
