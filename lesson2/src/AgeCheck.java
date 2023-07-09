package practice1;
import java.util.*;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int ageOfUser = sc.nextInt();
        
        System.out.println((ageOfUser >= 18) ? "Welcome to our community!": "Your age is not enough to enter this community.");

    }
    
}
