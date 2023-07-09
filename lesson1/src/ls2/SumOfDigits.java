package ls2;
import java.util.*;

public class SumOfDigits {
    
    static void sumOfDigits(int a){
        int sum = a / 10 + a % 10;
        System.out.println(sum);
    }
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();
        
        sumOfDigits(num);
    }
}
