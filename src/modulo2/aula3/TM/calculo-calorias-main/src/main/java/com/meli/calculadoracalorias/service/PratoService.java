package com.meli.calculadoracalorias.service;

import com.meli.calculadoracalorias.model.Ingrediente;
import com.meli.calculadoracalorias.repository.IngredienteRepositoryImpl;
import com.meli.calculadoracalorias.request.PratoRequest;
import com.meli.calculadoracalorias.response.PratoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PratoService {


    private IngredienteRepositoryImpl ingredienteRepositoryImpl;
    private IngredienteService ingredienteService;

    public PratoService(IngredienteRepositoryImpl ingredienteRepositoryImpl, IngredienteService ingredienteService) {
        this.ingredienteRepositoryImpl = ingredienteRepositoryImpl;
        this.ingredienteService = ingredienteService;
    }



    public PratoResponse buscaPratoInfo(PratoRequest pratoRequest) {

        List<Ingrediente> ingredientes = ingredienteService.buscarIngredientesPorIngredienteRequest(pratoRequest.getIngredientes());

        int totalDeCalorias = ingredienteService.totalDeCalorias(ingredientes);

        Ingrediente maisCalorico =  ingredienteService.ingredienteMaisCalorico(ingredientes);

        return new PratoResponse(pratoRequest.getNome(),ingredientes,totalDeCalorias,maisCalorico);
    }
}
