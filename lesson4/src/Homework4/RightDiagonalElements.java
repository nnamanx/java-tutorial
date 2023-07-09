package Homework4;

import java.util.Scanner;

public class RightDiagonalElements {

    static int sumOfRightDiagonalElements(int size, int[][] arr) {

        int sum = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) == (size - 1)) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//        Display the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of right diagonal elements: " + sumOfRightDiagonalElements(size, arr));
    }
}

