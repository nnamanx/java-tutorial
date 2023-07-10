package Homework4;

import java.util.Scanner;

public class UserName {

    public static final String savedUserName = "karam";
    public static final String savedPassword = "itisnothardpasswordforany1";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String userName = sc.nextLine();

        if (userName.equals(savedUserName)) {

            System.out.print("Password: ");

            for (int i = 0; i < 3; i++) {
                String password = sc.nextLine();

                if (savedPassword.equals(password)) {
                    System.out.println("Welcome back, " + userName + "!");
                    break;
                } else {
                    System.out.println("Try again");
                }

            }
        } else System.out.println("User name is not true.");

    }
}
