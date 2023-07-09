package Hw5;

import java.util.Scanner;

public class SumOfDiagonals {

    static int sumOfRightDiagonal(int size, int[][] arr) {

        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == size - 1) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    static int sumOfLeftDiagonal(int size, int[][] arr) {

        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[][] arr = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        Printing array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sumOfDiagonals = sumOfLeftDiagonal(size, arr) + sumOfRightDiagonal(size, arr);

        System.out.println("Sum of array's diagonals is " + sumOfDiagonals);
    }
}
