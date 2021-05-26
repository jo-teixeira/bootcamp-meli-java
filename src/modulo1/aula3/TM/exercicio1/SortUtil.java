package bootcamp.exercicio1;

public class SortUtil {
    public static <T> T[] sort(Precedente arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1].precedeA((T) arr[j]) > 0) {
                    Precedente temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return (T[]) arr;
    }

}
