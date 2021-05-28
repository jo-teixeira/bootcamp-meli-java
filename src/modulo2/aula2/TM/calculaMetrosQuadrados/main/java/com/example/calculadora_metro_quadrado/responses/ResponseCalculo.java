package com.example.calculadora_metro_quadrado.responses;

import com.example.calculadora_metro_quadrado.Comodo;

import java.util.ArrayList;

public class ResponseCalculo {
    private double area;
    private double preco;
    private ComodoDTO comodo;
    private ArrayList<ComodoDTO> comodos;

    public ResponseCalculo(){
    }

    public ResponseCalculo(double area, double preco, ComodoDTO comodo, ArrayList<ComodoDTO> comodos) {
        this.area = area;
        this.preco = preco;
        this.comodo = comodo;
        this.comodos = comodos;
    }

    public double getArea() {
        return area;a
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ComodoDTO getComodo() {
        return comodo;
    }

    public void setComodo(ComodoDTO comodo) {
        this.comodo = comodo;
    }

    public ArrayList<ComodoDTO> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<ComodoDTO> comodos) {
        this.comodos = comodos;
    }
}
