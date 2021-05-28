package com.mercadolivre.Diploma.controller;

import com.mercadolivre.Diploma.models.Aluno;
import com.mercadolivre.Diploma.responses.AlunoResponse;
import com.mercadolivre.Diploma.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping("/diploma")
    public ResponseEntity<AlunoResponse> getDiploma(@RequestBody Aluno aluno){
        Double notaFinal = alunoService.calcularNota(aluno.getDisciplinas());
        String mensagemFinal = "Você foi aprovado.";
        if(notaFinal > 9.0){
            mensagemFinal = "Parabéns você foi aprovado!!!!!!!!";
        }
        return ResponseEntity.status(HttpStatus.OK).body(new AlunoResponse(mensagemFinal,
                notaFinal, aluno.getNome()));
    }


}
