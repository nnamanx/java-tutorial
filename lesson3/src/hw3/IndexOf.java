package hw3;

import java.util.*;

public class IndexOf {

    static String indexOf(int element, int size, int arr[]) {

        String res = null;

        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                res = "The index of " + element + " is " + i + ".";
            } else {
                res = "The array does not contain this element.";
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("The array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Enter the element that you find the index: ");
        int element = sc.nextInt();

        System.out.println(indexOf(element, size, arr));
    }

}
