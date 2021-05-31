package com.mercadolibre.bootcamp.services;

import com.mercadolibre.bootcamp.exceptions.ObjectNotFoundException;
import com.mercadolibre.bootcamp.models.Cliente;
import com.mercadolibre.bootcamp.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente findById(Integer id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado."));
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
