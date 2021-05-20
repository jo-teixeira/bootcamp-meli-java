package br.com.mercadolivre.bootcamp.joao;

import java.util.Scanner;

public class ExerciseE {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com o numero n: ");
        int n = input.nextInt();

        System.out.println("Entre com o numero m: ");
        int m = input.nextInt();

        System.out.println("Entre com o numero d: ");
        int d = input.nextInt();

        numberProcess(n, m, d);
    }

    private static void numberProcess(int n, int m, int d){
        int numberCheck = 1;
        for(int i = 0; i < n; i++){
            while (!validateNumberOccur(numberCheck, m, d)){
                numberCheck++;
            }
            System.out.println(numberCheck);
            numberCheck++;
        }
    }

    // we can do it with stream() API
    private static boolean validateNumberOccur(int numberCheck, int m, int d){
        int numberOccurs = 0;
        String numberText = Integer.toString(numberCheck);
        for (int i = 0; i < numberText.length(); i++){
            if (String.valueOf(numberText.charAt(i)).equals(Integer.toString(d))){
                numberOccurs++;
            }
        }
        return numberOccurs == m;
    }
}
