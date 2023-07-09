package ordinalAndName;

public class OrdinalAndNameMethods {
    public static void main(String[] args) {

        String exception = ExceptionMessages.USERNOFOUND.name();
        System.out.println(exception);

        int placeOfException = ExceptionMessages.USERNOFOUND.ordinal();
        System.out.print(placeOfException);

        System.out.println(ExceptionMessages.USERNOFOUND.getErrorNum());
    }
}
