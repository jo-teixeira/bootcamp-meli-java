package br.com.mercadolivre.bootcamp.joao;

import java.util.Scanner;

public class ExerciseB {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com a quantidade de numeros a serem printados: ");
        int n = input.nextInt();

        System.out.println("Entre com o numero a ser processado: ");
        int m = input.nextInt();

        printAllMultipleNumbers(n, m);
    }

    private static void printAllMultipleNumbers(int n, int m){
        int numberCheck = 1;
        while(n != 0){
            if(numberCheck % m == 0) {
                System.out.println(numberCheck);
                n--;
            }
            numberCheck++;
        }
    }
}
