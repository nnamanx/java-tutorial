package Homework4;

import java.util.Scanner;

public class Even {
    static void evenNums(int num) {

        if (num % 2 == 0) {
            for (int i = 2; i < num - 1; i = i + 2) {
                System.out.print(i + " ");
            }

        } else {
            for (int i = 2; i < num; i = i + 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        System.out.println("Even numbers till " + num + ":");

        evenNums(num);

    }
}