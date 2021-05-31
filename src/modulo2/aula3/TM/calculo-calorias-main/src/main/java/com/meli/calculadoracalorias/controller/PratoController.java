package com.meli.calculadoracalorias.controller;

import com.meli.calculadoracalorias.request.PratoRequest;
import com.meli.calculadoracalorias.response.PratoResponse;
import com.meli.calculadoracalorias.service.PratoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/prato")
public class PratoController {


    private PratoService pratoService;

    public PratoController(PratoService pratoService) {
        this.pratoService = pratoService;
    }

    @PostMapping
    public ResponseEntity<PratoResponse> buscaCalorias(@RequestBody PratoRequest pratoRequest){
        PratoResponse pratoResponse = pratoService.buscaPratoInfo(pratoRequest);

        return ResponseEntity.ok(pratoResponse);
    }

}
