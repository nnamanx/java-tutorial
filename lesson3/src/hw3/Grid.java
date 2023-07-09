package hw3;

public class Grid {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (j == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("-");
        }
    }

}
