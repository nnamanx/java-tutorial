package ls2;
import java.util.*;

public class SmallestNum {
    
    static float smallest(int a, int b, int c){
         if(a < b) {
            if( c < a) {
                return c;
            } else {
		return a;
            }
	} else {
            if(b < c) {
		return b;
            } else {
                return c;
            }
	}
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = sc.nextInt();
        
        System.out.println("The smallest value is " + smallest(firstNum, secondNum, thirdNum));
        
    }
    
}
