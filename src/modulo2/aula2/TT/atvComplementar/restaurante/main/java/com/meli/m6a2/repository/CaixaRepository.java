package com.meli.m6a2.repository;

import com.meli.m6a2.model.Caixa;
import com.meli.m6a2.response.CaixaResponse;
import org.springframework.stereotype.Component;

@Component
public class CaixaRepository {

    private final static Caixa CAIXA = new Caixa();

    public void atualizaCaixa(double valor){
        CAIXA.setValorTotal( CAIXA.getValorTotal() + valor );
    }

    public CaixaResponse buscaSaldoDoCaixa(){
        return new CaixaResponse(CAIXA.getValorTotal());
    }
}
