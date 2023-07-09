package Homework4;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num) {

        boolean bool = true;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                bool = false;
                break;
            }
        }
        return bool;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

//        Printing the answer
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else System.out.println(num + " is a composite number.");
    }
}
