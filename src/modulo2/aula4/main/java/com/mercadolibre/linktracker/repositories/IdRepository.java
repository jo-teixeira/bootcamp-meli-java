package com.mercadolibre.linktracker.repositories;

import com.mercadolibre.linktracker.models.Id;
import com.mercadolibre.linktracker.models.Link;
import com.mercadolibre.linktracker.utils.Json;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IdRepository {

    public List<Id> findAll(){
        return Json.read(Id.class, "id.json");
    }

    public void setAll(List<Id> idList){
        Json.write(idList, "id.json");
    }
}
