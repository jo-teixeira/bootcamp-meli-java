package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Pedido;

import java.util.List;

public interface PedidoRepository {
    public List<Pedido> findByClienteId(Integer clienteId);

    Pedido save(Pedido pedido);
}
