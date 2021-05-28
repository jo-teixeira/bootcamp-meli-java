package com.example.calculadora_metro_quadrado.services;

import com.example.calculadora_metro_quadrado.Casa;
import com.example.calculadora_metro_quadrado.Comodo;
import com.example.calculadora_metro_quadrado.responses.ComodoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

@Service
public class ServiceCasa {
    public double calculeArea(Casa casa){
        return casa.getComodos().stream().mapToDouble(obj -> obj.getComprimento() * obj.getLargura())
                .reduce(0.0, ( areaTotal, area) -> areaTotal + area);
    }

    public double calculeArea(Comodo comodo){
        return comodo.getLargura()* comodo.getComprimento();
    }

    public double calculePreco(Casa casa, double preco){
        return calculeArea(casa) * preco;
    }

    public ComodoDTO calculeMaiorComodo(Casa casa){
        Comodo c = Collections.max(casa.getComodos(), Comparator.comparing(comodo -> comodo.getComprimento() * comodo.getLargura()));
        return new ComodoDTO(c.getNome(), calculeArea(c));
    }

    public ArrayList<ComodoDTO> returnComodos(ArrayList<Comodo> comodos){
        return (ArrayList) comodos.stream().map(comodo -> new ComodoDTO(comodo.getNome(), calculeArea(comodo))).collect(Collectors.toList());
    }

}
