package com.example.calculadora_metro_quadrado;

import com.example.calculadora_metro_quadrado.responses.ComodoDTO;
import com.example.calculadora_metro_quadrado.responses.ResponseCalculo;
import com.example.calculadora_metro_quadrado.services.ServiceCasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CalculadoraRestController {
    @Autowired
    private ServiceCasa serviceCasa;


    @PostMapping("/calculate")
    public ResponseEntity<ResponseCalculo> calcule(@RequestBody Casa casa){

        double areaTotal = serviceCasa.calculeArea(casa);
        double preco = serviceCasa.calculePreco(casa, 800);
        ComodoDTO comodo = serviceCasa.calculeMaiorComodo(casa);
        ArrayList<ComodoDTO> comodos = serviceCasa.returnComodos(casa.getComodos());



        return ResponseEntity.status(HttpStatus.OK).body(new ResponseCalculo(areaTotal, preco, comodo, comodos));
    }


}
