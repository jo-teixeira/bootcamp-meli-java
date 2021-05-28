package com.example.calculadora_metro_quadrado.responses;

public class ComodoDTO {
    private String nome;
    private double area;

    public ComodoDTO() {
    }

    public ComodoDTO(String nome, double area) {
        this.nome = nome;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public double getArea() {
        return area;
    }
}
