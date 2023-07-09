package Hw5;

import java.util.Scanner;

public class SwappingValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        System.out.println("The first number is " + num1 + " and the second number is " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping values, the first number is " + num1 + " and the second number is " + num2);

    }


}
