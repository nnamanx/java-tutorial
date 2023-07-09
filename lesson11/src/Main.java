import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanners for different data types
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

//        Creating an array
        Data[] dataArr = new Data[6];

//        Array elements
        dataArr[0] = new Data("laman", 123456789);
        dataArr[1] = new Data("ravan", 987654321);
        dataArr[2] = new Data("nazrin", 12345);
        dataArr[3] = new Data("turan", 54321);
        dataArr[4] = new Data("nigar", 67890);
        dataArr[5] = new Data("fateh", 99876);

//        Taking a name from user
        System.out.print("Enter a name: ");
        String name = scString.nextLine();

        for (int i = 0; i < dataArr.length; i++) {
            if (name.equals(dataArr[i].name)) {
                System.out.println(dataArr[i].name + " " + dataArr[i].id);
            } //How can I give else statement when the list does not have the given name?
        }

    }
}