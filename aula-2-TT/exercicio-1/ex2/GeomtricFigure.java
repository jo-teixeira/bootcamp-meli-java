package class4.list3.ex2;

public abstract class GeomtricFigure {

    public abstract double area();

    @Override
    public String toString() {
        return "Nao faz sentido dar override em uma classe abstrata";
    }
}