package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.models.Cliente;
import org.springframework.stereotype.Service;

public interface ClienteService {

    Cliente findById(Integer id);

    Cliente create(Cliente cliente);
}
