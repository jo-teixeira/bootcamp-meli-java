package com.meli.m6a2.model;

import java.util.List;

public class Pedido {

    private Long id;
    private Mesa mesa;
    private List<Prato> pratos;
    private double valorTotal;

    public Pedido() {

    }

    public Pedido(Mesa mesa, List<Prato> pratos, double valorTotal) {
        this.mesa = mesa;
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public Pedido(Long id, Mesa mesa, List<Prato> pratos) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
