package ls2;
import java.util.*;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        
        System.out.println("Now, choose the operation + - * /");
        char op = sc.next().charAt(0);
        
        switch(op){
            case '+':
                System.out.println(firstNum + secondNum);
                break;
            case '-':
                System.out.println(firstNum - secondNum);
                break;
            case '*':
                System.out.println(firstNum * secondNum);
                break;
            case '/':
                System.out.println(firstNum / secondNum);
                break;
            default:
                System.out.println("Please, enter a valid operation");
                break;
                      
        }
        
    }
}
