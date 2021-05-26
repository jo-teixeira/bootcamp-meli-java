package aula2.TT.exercise1.ex2;

public class Triangle extends GeomtricFigure{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base*height/2;
    }
}
