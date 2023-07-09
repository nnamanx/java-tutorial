package hw3;

import java.util.*;

public class Contains {

    static boolean arrayContains(int size, int specified, int arr[]) {

        boolean bool = false;

        for (int i = 0; i < size; i++) {

            if (arr[i] == specified) {
                bool = true;
            }
        }

        return bool;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the specific value to search: ");

        int specified = sc.nextInt();

//        Calling the method to check whether it contains the value.
        if (arrayContains(size, specified, arr) == true) {
            System.out.println("Yes, the array contians " + specified);
        } else {
            System.out.println("No, the array does not contian " + specified);
        }

    }

}
