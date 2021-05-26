package aula2.TT.exercise1.ex2;

public class Rectangle extends GeomtricFigure {

    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return height * base;
    }
}
