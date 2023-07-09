package Homework4;

import java.util.Scanner;

public class SquareMatrix {

    static void diagonalElements(int size, int[][] arr) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == 0 && j == 0) || (i == (size - 1) && (j == size - 1)) || (i == 0 && j == (size - 1)) || (i == (size - 1) && j == 0)) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {

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
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("First elements of diagonals: ");
        diagonalElements(size, arr);
    }

}
