package aula2.TM.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = criaEstudantes();
        ArrayList<Disciplina> disciplinas = criaDisciplinas();
        Turma turma = new Turma("8 Serie", disciplinas, estudantes);
        System.out.println("\nTurma criada: " + turma.getSerie());
        System.out.println("Quantidade de estudantes: " + turma.getEstudantes().size());
        System.out.println("Quantidade de disciplinas: " + turma.getDisciplinas().size());
    }

    public static ArrayList<Estudante>  criaEstudantes(){
        ArrayList<Estudante> estudantes = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Estudante estudante = new Estudante("Estudante " + i, 18 + i, i, "8 ano");
            estudantes.add(estudante);
            System.out.println("Estudante adicionado: " + estudante.getNome());
        }
        System.out.println();
        return estudantes;
    }

    public static ArrayList<Disciplina>  criaDisciplinas(){
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            Disciplina disciplina = new Disciplina("Disciplina " + i, 18.0 + i);
            disciplinas.add(disciplina);
            System.out.println("Disciplina adicionada: " + disciplina.getNome());
        }
        System.out.println();
        return disciplinas;
    }

}
