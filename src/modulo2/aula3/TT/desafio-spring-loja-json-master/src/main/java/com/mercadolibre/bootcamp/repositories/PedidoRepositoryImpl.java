package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Pedido;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PedidoRepositoryImpl implements PedidoRepository{
    @Override
    public List<Pedido> findByClienteId(Integer clienteId) {
        return null;
    }

    @Override
    public Pedido save(Pedido pedido) {
        return null;
    }
}
