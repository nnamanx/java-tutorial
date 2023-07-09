package fromUser;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the Local Date(year/month/day) : ");
        String userDate =  new Scanner(System.in).nextLine();

        String[] editedUserDate = userDate.split("/");
        int year = Integer.parseInt(editedUserDate[0]);
        int month = Integer.parseInt(editedUserDate[1]);
        int day = Integer.parseInt(editedUserDate[2]);

        LocalDate localDate = LocalDate.of(year,month,day);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(localDate.format(dateTimeFormatter));
    }

}


