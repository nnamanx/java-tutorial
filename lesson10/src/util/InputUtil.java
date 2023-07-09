package util;

import java.util.Scanner;

public class InputUtil {

//    Input for String data value
    public static String inputTypeString(String str){

        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextLine();
    }

//    Input for long data value
    public static long inputTypeLong(String str){

        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextLong();
    }

//    Input for short data value
    public static short inputTypeShort(String str){

        Scanner sc = new Scanner(System.in);
        System.out.print(str);
        return sc.nextShort();
    }
}
