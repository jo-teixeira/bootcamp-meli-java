package com.company;

public class Arma {
    private String _id;
    private String nome;
    private int dano;

    public Arma(String _id, String nome, int dano) {
        this._id = _id;
        this.nome = nome;
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Arma{" +
                "_id='" + _id + '\'' +
                ", nome='" + nome + '\'' +
                ", dano=" + dano +
                '}';
    }

    public void atacar(){
        System.out.println("Ataque com as mãos!!");
    };

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }
}
