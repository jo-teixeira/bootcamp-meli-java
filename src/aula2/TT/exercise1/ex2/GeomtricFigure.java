package aula2.TT.exercise1.ex2;

public abstract class GeomtricFigure {

    public abstract double area();

    @Override
    public String toString() {
        return "Nao faz sentido dar override em uma classe abstrata";
    }
}