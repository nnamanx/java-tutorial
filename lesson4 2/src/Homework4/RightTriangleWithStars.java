package Homework4;

import java.util.Scanner;

public class RightTriangleWithStars {

    static void rightTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for size of the triangle: ");
        int n = sc.nextInt();

        rightTriangle(n);
    }
}
