package com.meli.m6a2.controller;

import com.meli.m6a2.repository.CaixaRepository;
import com.meli.m6a2.response.CaixaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaixaController {

    @Autowired
    private CaixaRepository caixaRepository;

    @GetMapping(value = "/caixa/valor")
    public ResponseEntity<CaixaResponse> buscaValorCaixa(){
        CaixaResponse caixaResponse = caixaRepository.buscaSaldoDoCaixa();

        return ResponseEntity.ok(caixaResponse);
    }
}
