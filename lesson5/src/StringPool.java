package Hw5;

public class StringPool {

    public static void main(String[] args) {

        String str = "Java";
        String str2 = new String("Java");
        String str3 = "Java";

        System.out.println(str == str2);
        System.out.println(str == str3);
    }

}
