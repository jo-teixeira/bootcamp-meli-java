package class4.list3.ex2;

public class Ex2 {
    public static void main(String[] args) {

        GeomtricFigure[] arr = new GeomtricFigure[]{new Triangle(1, 3), new Circle(5), new Rectangle(3, 6)};
        double averageArea = AreaHelper.areaMedia(arr);
        System.out.println(averageArea);
    }
}
