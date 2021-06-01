package com.mercadolibre.linktracker.services;

import com.mercadolibre.linktracker.models.Id;
import com.mercadolibre.linktracker.repositories.IdRepository;
import com.mercadolibre.linktracker.utils.Json;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IdService {

    private IdRepository idRepository;

    public IdService(IdRepository idRepository) {
        this.idRepository = idRepository;
    }

    public int incrementId() {
        List<Id> idList = idRepository.findAll();
        int id = idList.get(0).getId() + 1;
        idList.get(0).setId(id);
        idRepository.setAll(idList);
        return id;
    }
}
