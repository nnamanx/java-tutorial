package ls2;
import java.util.*;

public class AgeTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int ageOfUser = sc.nextInt();
        
        if(ageOfUser >= 18){
            System.out.println("Welcome to our community!");
        } else {
            System.out.println("Your age is not enough to enter this community.");
        }
    }
    
}
