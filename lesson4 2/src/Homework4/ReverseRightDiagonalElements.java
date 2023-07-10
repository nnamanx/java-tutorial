//
//
//
//does not work properly
//
//
//

package Homework4;

import java.util.Scanner;

public class ReverseRightDiagonalElements {

    static void reversRightDiagonal(int size, int[][] arr) {

        int temp;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i + j == (size - 1)) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[][] arr = new int[size][size];

        System.out.println("Enter array elements: ");

//      Creating an array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

//      Displaying the array
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Reversed right diagonal: ");
        reversRightDiagonal(size, arr);
    }

}
