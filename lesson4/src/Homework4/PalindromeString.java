package Homework4;

import java.util.Scanner;

public class PalindromeString {

    static boolean isPalindrome(String str){

        boolean bool = true;
        char [] letters = str.toCharArray();

        for(int i = 0, j = letters.length - 1; j > i; i++, j--){
            if(letters[i] != letters[j]){
                bool = false;
            }
        }
        return bool;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome word.");
        } else System.out.println(str + " is not a palindrome word.");
    }
}
