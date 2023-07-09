package Homework4;

import java.util.Scanner;

public class Factorial {

    static long factorial(int num) {

        if (num == 0) {
            return 1;
        } else return (num * factorial(num - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(num + "! = " + factorial(num));

    }
}
