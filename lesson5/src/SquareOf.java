package Hw5;

import java.util.*;

public class SquareOf {

    public static void main(String[] args) {

        String t = "             1,e 6,e 0,e 9,e           ";
        char[] chars = t.toCharArray();
        int num = 0;

        for (int i = 0; i < t.length(); i++) {
            if (Character.isDigit(chars[i])) {
                num = Character.getNumericValue(chars[i]);
                System.out.println(Math.pow(num, 2));
            }
        }
    }

}
