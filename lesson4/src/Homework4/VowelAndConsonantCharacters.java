package Homework4;

import java.util.Scanner;

public class VowelAndConsonantCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        char[] charStr = str.toCharArray();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < str.length(); i++) {
            if (charStr[i] == 'a' || charStr[i] == 'e' || charStr[i] == 'i' || charStr[i] == 'o' || charStr[i] == 'u') {
                vowel++;
            } else consonant++;
        }

        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
