package Transfer;

public class CardNumbers {
    Long cardNumber;
    Double cardBalance;


    public CardNumbers(Long cardNumber){
        this.cardNumber = cardNumber;
    }

    public CardNumbers(Long cardNumber, double cardBalance){
        this.cardNumber = cardNumber;
        this.cardBalance = cardBalance;
    }

    public CardNumbers(CardNumbers cardNumber) {

    }

    @Override
    public String toString() {
        return "CardNumbers{" +
                "cardNumber=" + cardNumber +
                ", cardBalance=" + cardBalance +
                '}';
    }
}
