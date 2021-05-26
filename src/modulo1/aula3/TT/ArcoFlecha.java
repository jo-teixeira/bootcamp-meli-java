package com.company;

public class ArcoFlecha extends Arma{

    public ArcoFlecha(String _id, String nome, int dano) {
        super(_id, nome, dano);
    }

    @Override
    public void atacar(){
        System.out.println("Ataque com Arco e Flecha!");
    }
}
