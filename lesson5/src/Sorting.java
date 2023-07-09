package Hw5;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    static void sorting(int size, int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

//        Printing given array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

//        ordered version of the array
        sorting(size, arr);
    }
}