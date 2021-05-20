import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    public static ArrayList<String> prepareArrays(int iArr[]) {
        String sArr[] = new String[iArr.length];
        int maxLength = 0;
        int length;
        for (int i = 0; i < iArr.length; i++) {
            sArr[i] = Integer.toString(iArr[i]);
            length = sArr[i].length();
            if (length > maxLength) {
                maxLength = length;
            }
        }
        for (int i = 0; i < iArr.length; i++) {
            length = sArr[i].length();
            String toAdd = "";
            for (int j = 0; j < maxLength - length; j++) {
                toAdd += "0";
            }
            sArr[i] = toAdd + sArr[i];
        }

        return new ArrayList<String>(Arrays.asList(sArr));
    }

    public static ArrayList<ArrayList<String>> processDigits(ArrayList<String> sArr, int position) {
        ArrayList<ArrayList<String>> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(new ArrayList<String>());
        }
        for (String value : sArr) {
            int digit = Integer.parseInt(Character.toString(value.charAt(value.length() - position - 1)));
            array.get(digit).add(value);
        }
        return array;

    }

    private static ArrayList<String> concatenateArray(ArrayList<ArrayList<String>> digitsArray) {
        ArrayList<String> concatenatedArray = new ArrayList<>();
        for (ArrayList<String> array : digitsArray) {
            for (String element : array) {
                concatenatedArray.add(element);
            }
        }

        return concatenatedArray;
    }

    public static ArrayList<Integer> radixSort(int iArr[]) {

        ArrayList<String> sArr = prepareArrays(iArr);
        int maxLength = sArr.get(0).length();
        for (int i = 0; i < maxLength; i++) {
            ArrayList<ArrayList<String>> digitsArray = processDigits(sArr, i);
            ArrayList<String> concatenatedArray = concatenateArray(digitsArray);
            sArr = concatenatedArray;
        }

        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (String element : sArr) {
            sortedArray.add(Integer.parseInt(element));
        }

        return sortedArray;

    }


    public static void main(String[] args) {
        int iArr[] = {16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        ArrayList<Integer> sortedArray = radixSort(iArr);

        for (int i : sortedArray) {
            System.out.print(i + " ");
        }
    }
}
