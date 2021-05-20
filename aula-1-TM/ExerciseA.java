package br.com.mercadolivre.bootcamp.joao;

import java.util.Scanner;

public class ExerciseA {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com o numero a ser processado: ");
        int n = input.nextInt();

        printAllEvenNumbers(n);
    }

    private static void printAllEvenNumbers(int n){
        int numberCheck = 1;
        while(n != 0){
            if(numberCheck % 2 == 0) {
                System.out.println(numberCheck);
                n--;
            }
            numberCheck++;
        }
    }
}
