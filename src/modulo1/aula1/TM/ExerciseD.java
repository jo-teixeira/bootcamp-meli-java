package aula1.TM;

import java.util.Scanner;

public class ExerciseD {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Entre com o numero a ser processado: ");
        int n = input.nextInt();

        printPrimeNumbers(n);
    }

    private static void printPrimeNumbers(int n){
        int numberCheck = 1;
        while(n != 0){
            if(isPrime(numberCheck)) {
                System.out.println(numberCheck);
                n--;
            }
            numberCheck++;
        }
    }

    private static boolean isPrime(int n){
        int divisibleNumbers = 1;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0) {
                divisibleNumbers++;
            }
        }
        return divisibleNumbers < 2;
    }
}
