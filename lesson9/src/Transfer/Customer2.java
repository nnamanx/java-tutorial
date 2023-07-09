package Transfer;

public class Customer2 {
    String fullName;
    double balance;

    CardNumbers cardNumber;

//    Constructor

    public Customer2(String fullName, CardNumbers cardNumber) {
        this.fullName = fullName;
        this.cardNumber = cardNumber;
    }

    CardNumbers card = new CardNumbers(cardNumber);

//add card number to cards
//    void addCardNumber(Long cardNumber) {
//        CardNumbers[] cards = new CardNumbers[2];
//        for (int i = 0; i < 2; i++) {
//            cards[i+1] = new CardNumbers(this.cardNumber, this.balance);
//            break;
//        }
//    }


}
