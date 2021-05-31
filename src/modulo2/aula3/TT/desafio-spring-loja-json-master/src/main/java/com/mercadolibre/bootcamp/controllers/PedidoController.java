package com.mercadolibre.bootcamp.controllers;

import com.mercadolibre.bootcamp.dtos.PedidoDTO;
import com.mercadolibre.bootcamp.models.Pedido;
import com.mercadolibre.bootcamp.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Pedido> create(@RequestBody @Valid PedidoDTO pedidoDTO) {

        Pedido pedido = pedidoService.pedidoDTOToModel(pedidoDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.create(pedido));
    }
}
