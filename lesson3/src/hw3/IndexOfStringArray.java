package hw3;

import java.util.*;

public class IndexOfStringArray {

    static char indexOf(int index, String str) {

        char ch = str.charAt(index);

        return ch;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string value: ");

        String str = sc.nextLine();

        System.out.print("Enter an index to get its character: ");

        int index = sc.nextInt();

        System.out.println(indexOf(index, str));
    }

}
