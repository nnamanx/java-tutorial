package hw3;

import java.util.*;

public class MaxAndMin {

//    Max value of the array
    static int max(int size, int[] arr) {

        int max = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //    Min value of the array
    static int min(int size, int[] arr) {

        int min = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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

        System.out.println("The min value of the array is " + min(size, arr) + " and the max value of the array is " + max(size, arr) + ".");

    }

}
