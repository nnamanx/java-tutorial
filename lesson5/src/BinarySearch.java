//
//
//gives wrong index
//
//
package Hw5;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        char[] arr = new char[size];

        System.out.println("Enter  array of characters: ");


        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        Arrays.sort(arr);

        System.out.println("Enter a character that you wanna get its index: ");

        char ch = sc.next().charAt(0);

        for (int i = 0; i < size; i++) {
            if(arr[i] == 1){
                System.out.println();
            }
        }

        System.out.println("Index of " + ch + " is " + Arrays.binarySearch(arr, ch));
    }
}
