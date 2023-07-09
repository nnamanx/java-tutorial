package hw3;

import java.util.*;

public class Sum {

    static int sumOfArrayElements(int size, int arr[]) {

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of the elements of the array is " + sumOfArrayElements(size, arr));
    }
}
