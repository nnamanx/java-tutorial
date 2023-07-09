import javax.swing.*;
import java.util.Scanner;

public class task5 {

    static String username = "nnamanx";
    static String password = "12131lalaland";


    public static boolean checkPassword(String getPassword) {

        Scanner sc = new Scanner(System.in);

        if (getPassword.equals(password))
            return true;
        else {
            int i = 0;
            while (!(getPassword.equals(password)) && i < 2) {
                if (getPassword.equals(password))
                    return true;
                else {
                    System.out.println("Try again");
                    getPassword = sc.nextLine();
                    i++;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter username: ");
        String getUsername = sc.nextLine();


        System.out.println("Enter password: ");
        String getPassword = sc.nextLine();


        if (!checkPassword(getPassword)) {
            System.exit(-1);
        }

        System.out.println("Welcome " + getUsername + "!");


    }
}
