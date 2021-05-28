package com.meli.m6a2.controller;

import com.meli.m6a2.response.PedidoResponse;
import com.meli.m6a2.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @GetMapping(value = "/pedidos/mesas/{idMesa}" )
    public ResponseEntity<PedidoResponse> buscaPedidosPorMesa(@PathVariable(value = "idMesa") Long idMesa){
        PedidoResponse pedidoResponse = pedidosService.buscaPedidosPorMesa(idMesa);

        return ResponseEntity.ok(pedidoResponse);
    }

    @PostMapping(value = "/pedidos/mesas/{idMesa}")
    public ResponseEntity criaPedido(@RequestBody List<Long> idsPrato,
                                     @PathVariable(value = "idMesa") Long idMesa){
        pedidosService.criaPedido(idMesa, idsPrato);

        return ResponseEntity.ok("Criado");
    }
}
