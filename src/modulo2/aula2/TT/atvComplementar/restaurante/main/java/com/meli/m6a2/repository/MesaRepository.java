package com.meli.m6a2.repository;

import com.meli.m6a2.exception.MesaNotFoundException;
import com.meli.m6a2.model.Mesa;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class MesaRepository {

    private final Map<Long, Mesa> mesas = new HashMap<>();

    @PostConstruct
    public void init(){
        mesas.put(1L, new Mesa(1L));
        mesas.put(2L, new Mesa(2L));
        mesas.put(3L, new Mesa(3L));
    }

    public Mesa buscaMesaPorId(Long id){
        Mesa mesa = mesas.get(id);

        if(mesa == null){
            throw new MesaNotFoundException( String.format("Mesa com id=%s não foi encontrada", id ));
        }

        return mesa;
    }
}
