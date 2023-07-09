package hw3;

import java.util.*;

public class DuplicateInt {

    static void duplicateElements(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Duplicated elements: ");

        duplicateElements(arr);
    }

}
