package com.meli.m6a2.response;

import java.util.List;

public class PedidoResponse {

    private List<PratoResponse> itensPedido;
    private double valorTotalConsumido;

    public List<PratoResponse> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(List<PratoResponse> itensPedido) {
        this.itensPedido = itensPedido;
    }

    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public void setValorTotalConsumido(double valorTotalConsumido) {
        this.valorTotalConsumido = valorTotalConsumido;
    }
}
