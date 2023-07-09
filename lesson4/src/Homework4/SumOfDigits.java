package Homework4;

import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int num){

        int sum = 0;

        while(num > 0){
            sum += (num % 10);
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = sc.nextInt();

        System.out.println("Sum of the digits of the number is " + sumOfDigits(number) + ".");
    }
}
