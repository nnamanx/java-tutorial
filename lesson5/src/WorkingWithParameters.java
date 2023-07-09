package Hw5;

import java.util.Scanner;

public class WorkingWithParameters {

    static void printingValues(char ch, int n, boolean bool) {
        if (bool) {
            for (int i = 0; i < n; i++) {
                System.out.println(ch);
            }
        } else System.out.println("Try again!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bool = false;

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            bool = true;
        }

        System.out.println("Enter a size: ");
        int size = sc.nextInt();

        System.out.println("And enter a character: ");
        char ch = sc.next().charAt(0);

        printingValues(ch, size, bool);
    }
}
