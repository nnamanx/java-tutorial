package ls2;
import java.util.*;

public class Average {
    
    static float average(int a, int b, int c){
        
        return (a + b + c) /((float)(3));
//        WHY 3?
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstN = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondN = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdN = sc.nextInt();
        
        System.out.println(average(firstN, secondN, thirdN));
        
    }
    
}
