package class4.list3.ex2;

public class Circle extends GeomtricFigure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.pow(radius,2)*Math.PI;
    }
}
