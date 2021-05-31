package com.mercadolibre.bootcamp.models;

import java.util.List;

public class Pedido {
    private Integer id;
    private List<Produto> produtos;
    private Double valorTotal;
    private Cliente cliente;

    public Pedido(Integer id, List<Produto> produtos, Double valorTotal, Cliente cliente) {
        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    public Pedido() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente idCliente) {
        this.cliente = idCliente;
    }
}
