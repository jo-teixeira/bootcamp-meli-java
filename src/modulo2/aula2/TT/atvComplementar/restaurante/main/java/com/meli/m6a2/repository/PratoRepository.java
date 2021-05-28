package com.meli.m6a2.repository;

import com.meli.m6a2.exception.PratoNotFoundException;
import com.meli.m6a2.model.Prato;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PratoRepository {

    private final Map<Long, Prato> pratos = new HashMap<>();

    @PostConstruct
    public void init(){
        pratos.put(1L, new Prato(1L, 5, "Coxinha de Frango"));
        pratos.put(2L, new Prato(2L, 8, "Pastel"));
        pratos.put(3L, new Prato(3L, 7, "Hamburguer"));
    }

    public Prato buscaPratoPorId(Long id){
        Prato prato = pratos.get(id);

        if(prato == null){
            throw new PratoNotFoundException( String.format( "Prato com id=%s não encontrado", id ));
        }

        return prato;
    }

    public List<Prato> buscaTodosOsPratosPorIds(List<Long> ids){
        List<Prato> pratos = new ArrayList<>();

        ids.forEach(l -> pratos.add(this.buscaPratoPorId(l)));

        return pratos;
    }
}
