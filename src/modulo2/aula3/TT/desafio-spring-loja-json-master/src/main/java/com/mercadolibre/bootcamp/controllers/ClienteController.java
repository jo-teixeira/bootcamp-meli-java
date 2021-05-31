package com.mercadolibre.bootcamp.controllers;

import com.mercadolibre.bootcamp.dtos.ClienteDTO;
import com.mercadolibre.bootcamp.models.Cliente;
import com.mercadolibre.bootcamp.models.Pedido;
import com.mercadolibre.bootcamp.services.ClienteService;
import com.mercadolibre.bootcamp.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;
    private PedidoService pedidoService;

    public ClienteController(ClienteService clienteService, PedidoService pedidoService) {
        this.clienteService = clienteService;
        this.pedidoService = pedidoService;
    }

    @PostMapping
    public ResponseEntity<Cliente> create(@RequestBody @Valid ClienteDTO clienteDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.create(clienteDTO.toModel()));
    }

    @GetMapping("/{id}/pedidos")
    public ResponseEntity<List<Pedido>> getPedidos(@PathVariable Integer id) {
        return ResponseEntity.ok(pedidoService.getByClienteId(id));
    }
}
