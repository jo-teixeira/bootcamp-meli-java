package com.meli.m6a2.builder;

import com.meli.m6a2.model.Mesa;
import com.meli.m6a2.model.Pedido;
import com.meli.m6a2.model.Prato;
import com.meli.m6a2.response.PedidoResponse;
import com.meli.m6a2.response.PratoResponse;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {

    public static PedidoResponse builder(List<Pedido> pedidos){
        double valorTotalConsumido = 0;
        List<PratoResponse> itensPedidos = new ArrayList<>();

        for (Pedido pedido: pedidos) {
            List<Prato> pratos = pedido.getPratos();

            for (Prato prato: pratos) {
                itensPedidos.add( new PratoResponse( prato.getDescricao()) );

                valorTotalConsumido += prato.getPreco();
            }
        }

        PedidoResponse pedidoResponse = new PedidoResponse();
        pedidoResponse.setItensPedido(itensPedidos);
        pedidoResponse.setValorTotalConsumido( valorTotalConsumido );

        return pedidoResponse;
    }
}
