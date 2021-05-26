package com.company;

public class Personagem {
    private String nome;
    private int vidaTotal;
    private int vidaAtual;
    private String classe;
    private Arma arma;


    public Personagem(String nome, int vidaTotal, int vidaAtual, String classe, Arma arma) {
        this.nome = nome;
        this.vidaTotal = vidaTotal;
        this.vidaAtual = vidaAtual;
        this.classe = classe;
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vidaTotal=" + vidaTotal +
                ", vidaAtual=" + vidaAtual +
                ", classe='" + classe + '\'' +
                ", arma=" + arma +
                '}';
    }

    public void trocaArma(Arma arma){
        this.arma = arma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        this.vidaAtual = vidaAtual;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}
