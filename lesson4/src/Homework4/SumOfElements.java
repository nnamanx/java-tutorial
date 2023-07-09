package Homework4;

import java.util.Scanner;

public class SumOfElements {
    static int sumOfElements(int row, int column, int arr[][]) {

        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");

        int row = sc.nextInt();

        System.out.print("Enter column size: ");

        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        System.out.println("Enter two-dimenional array: ");

        // 2D array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Sum of two-dimentional array elements: " + sumOfElements(row, column, arr));

    }
}