package aula2.TM.exercise1;

import java.util.ArrayList;

public class Turma {
    private String serie;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Estudante> estudantes;

    public Turma(String serie, ArrayList<Disciplina> disciplinas, ArrayList<Estudante> estudantes) {
        this.serie = serie;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
}
