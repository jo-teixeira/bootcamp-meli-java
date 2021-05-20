import java.util.Arrays;
import java.util.Collections;

public class ExerciseExtraA {

    private static final Integer[] array =  {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

    public static void main(String[] args) {
        Arrays.sort(array);
        printCrescentArrayOrder();
        printDecrescentArrayOrder();
    }

    private static void printCrescentArrayOrder(){
        System.out.println("Crescent order: " + Arrays.toString(array));
    }

    private static void printDecrescentArrayOrder(){
        Collections.reverse(Arrays.asList(array));
        System.out.println("Decrescent order: " + Arrays.toString(array));
    }
}
