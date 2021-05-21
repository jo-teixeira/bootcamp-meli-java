package class4.list3.ex2;

public abstract class AreaHelper {

    public static double areaMedia(GeomtricFigure[] arr){
        double totalArea = 0;

        for (GeomtricFigure element: arr){
            totalArea += element.area();
        }

        return totalArea/arr.length;
    }
}
