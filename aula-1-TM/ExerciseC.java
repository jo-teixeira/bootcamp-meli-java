package br.com.mercadolivre.bootcamp.joao;

import java.util.Scanner;

public class ExerciseC {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com o numero a ser processado: ");
        int n = input.nextInt();

        isPrime(n);
    }

    private static void isPrime(int n){
        int divisibleNumbers = 1;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                divisibleNumbers++;
            }
        }
        if(divisibleNumbers > 2){
            System.out.println("nao eh primo!");
        }else{
            System.out.println("eh primo!");
        }
    }
}
