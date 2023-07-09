//
//
//       Does not work properly:(
//
//
package Homework4;

import java.util.Scanner;

public class CountElements {

    static void countElements(String str) {

        int cnt[] = new int[256];

        //        char chars[] = new char[str.length()];  //array of string


        for (int i = 0; i < str.length(); i++) {

            char chars[] = new char[str.length()];

            cnt[str.charAt(i)]++;
            if (cnt[str.charAt(i)] > 1) {
                for (int j = 0; j <= i; j++) {
                    if (str.charAt(i) == chars[j]) {

                    }
                }
            } else {
                System.out.println(str.charAt(i) + " - " + cnt[str.charAt(i)]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Write a word: ");
        String str = sc.nextLine();

        countElements(str);
    }

}
