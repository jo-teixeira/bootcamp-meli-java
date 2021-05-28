package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.dtos.PedidoDTO;
import com.mercadolibre.bootcamp.models.Pedido;
import com.mercadolibre.bootcamp.models.Produto;

import java.util.List;

public interface PedidoService {

    Pedido create(Pedido pedido);

    List<Pedido> getByClienteId(Integer id);

    Pedido pedidoDTOToModel(PedidoDTO pedidoDTO);

    Double calculaValorTotal(List<Produto> produtos);
}
