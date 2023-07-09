package stars;

import java.util.Scanner;

public class Main {

    //        Triangle
    public static void triangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    //Rectangle
    public static void rectangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void rectangleWithDiagonals(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == n - 1) || (i == j) || (i + j == n-1))  {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }

    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of starts: ");
        int n = sc.nextInt();

        triangle(n);
        System.out.println("====================");
        rectangle(n);
        System.out.println("====================");
        rectangleWithDiagonals(n);

    }
}


