package com.company;

public class Espada extends Arma {

    public Espada(String _id, String nome, int dano) {
        super(_id, nome, dano);
    }

    @Override
    public void atacar(){
        System.out.println("Ataque com Espada!");
    }
}
