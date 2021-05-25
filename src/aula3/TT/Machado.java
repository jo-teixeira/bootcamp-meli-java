package com.company;

public class Machado extends Arma{

    public Machado(String _id, String nome, int dano) {
        super(_id, nome, dano);
    }

    @Override
    public void atacar(){
        System.out.println("Ataque com Machado!");
    }
}
