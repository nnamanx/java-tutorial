package homework5;

public class Date {
    public static int day;
    public static int year;
    public static String month;

    static void dayOf(int day){
        System.out.println("The day is " + day);
    }

    static void monthOf(String month){
        System.out.println("The day is " + month);
    }

    static void yearOf(int year){
        System.out.println("The day is " + year);
    }

    static void fullDate(int day, int year, String month){
        System.out.println("Today is " + day + " of " + month + ", " + year);
    }
    
}
