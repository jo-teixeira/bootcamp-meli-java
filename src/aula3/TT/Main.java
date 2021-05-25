package com.company;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Espada espada = new Espada("1", "espada", 15);
        ArcoFlecha arcoFlecha = new ArcoFlecha("2", "arco e flecha", 10);
        Machado machado = new Machado("3", "machado", 20);

	    Personagem principal = new Personagem("João", 100, 90, "Guerreiro", espada);
        System.out.println(principal);
        principal.getArma().atacar();
        System.out.println();

        principal.trocaArma(arcoFlecha);
        System.out.println(principal);
        principal.getArma().atacar();
        System.out.println();

        principal.trocaArma(machado);
        System.out.println(principal);
        principal.getArma().atacar();
        System.out.println();

        principal.trocaArma(espada);
        System.out.println(principal);
        principal.getArma().atacar();
        System.out.println();

        String[] armas = { espada.getNome(), arcoFlecha.getNome(), machado.getNome()};

        System.out.println(Arrays.stream(armas).sorted().collect(Collectors.toList()));




    }
}
