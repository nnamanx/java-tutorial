package Homework4;

import java.util.Scanner;

public class DivFive {
    static void divFive(int row, int column, int[][] arr) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] % 5 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter row size: ");

        int row = sc.nextInt();

        System.out.print("Enter column size: ");

        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        System.out.println("Enter two-dimentional array: ");

        // Taking 2D array from user
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Numbers divided by 5: ");

        divFive(row, column, arr);
    }
}