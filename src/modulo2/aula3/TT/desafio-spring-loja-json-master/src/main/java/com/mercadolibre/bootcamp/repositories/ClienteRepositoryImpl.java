package com.mercadolibre.bootcamp.repositories;

import com.mercadolibre.bootcamp.models.Cliente;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ClienteRepositoryImpl implements ClienteRepository {

    @Override
    public Optional<Cliente> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return null;
    }
}
