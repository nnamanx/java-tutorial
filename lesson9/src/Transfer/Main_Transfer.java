package Transfer;
import java.util.Scanner;
public class Main_Transfer {
    public static void main(String[] args) {
//         Scanners for different data types
        Scanner scLong = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);

        Customer1 customer1 = new Customer1("Laman", new CardNumbers(123456789L));
        Customer2 customer2 = new Customer2("Nazrin", new CardNumbers(987654321L));

        System.out.println("Do you want to money transfer? yes/no");
        String answer = scString.nextLine();

        String defYes = "yes";
        String defNo = "no";

        if(answer.toLowerCase().equals(defYes)){
            System.out.print("Enter the card number: ");
            long cardNumber = scLong.nextLong();

            CardNumbers[] cards = new CardNumbers[2];

            for(int i = 0; i < 2; i++){
                if(cardNumber == cards[i].cardNumber) {
                    System.out.print("Amount of money: ");
                    int increaseBalance = scLong.nextInt();
                    cards[i].cardBalance += increaseBalance;
                    break;
                }
            }
        }
        else if(answer.toLowerCase().equals(defNo)){
            System.exit(-1);
        }
        else System.out.print("Write only 'yes' or 'no'");
    }
}
