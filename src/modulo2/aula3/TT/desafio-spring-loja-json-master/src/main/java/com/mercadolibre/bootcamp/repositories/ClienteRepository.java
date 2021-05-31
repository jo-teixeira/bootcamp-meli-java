package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Cliente;

import java.util.Optional;

public interface ClienteRepository {
    Optional<Cliente> findById(Integer id);

    Cliente save(Cliente cliente);
}
