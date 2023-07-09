package hw3;

import java.util.*;

public class ReverseArray {

    static void reverseArray(int size, int arr[]) {

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size opf the array: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter values of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original array: ");

//        Original array
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Reversed array: ");

//        Reversed array
        reverseArray(size, arr);
    }

}
