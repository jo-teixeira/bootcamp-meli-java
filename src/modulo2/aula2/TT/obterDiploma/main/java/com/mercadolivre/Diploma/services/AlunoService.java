package com.mercadolivre.Diploma.services;

import com.mercadolivre.Diploma.models.Disciplina;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class AlunoService {
    public Double calcularNota(ArrayList<Disciplina> disciplinas){
        return (new Double ((int)(disciplinas.stream().map(obj -> obj.getNota()).reduce(0.0,(acumulator, obj) ->
                acumulator + obj) / disciplinas.size() * 100))) / 100;
    }
}
