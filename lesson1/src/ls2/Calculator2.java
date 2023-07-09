package ls2;
import java.util.*;

public class Calculator2 {
//    Addition 
       static float sum(float a, float b){
           return a + b;
       }
//     Subtraction
       static float sub(float a, float b){
           return a - b;
       }
//     Multiplication
       static float mul(float a, float b){
           return a * b;
       }
//     Division
       static float div(float a, float b){
           return a / b;
       }
       
       
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter he first number: ");
        float firstNum = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNum = sc.nextFloat();
        
        System.out.println("Choose the operation + - * /");
        char op = sc.next().charAt(0);
        
        switch(op){
            case '+':
                System.out.println(sum(firstNum, secondNum));
                break;
            case '-':
                System.out.println(sub(firstNum, secondNum));
                break;
            case '*':
                System.out.println(mul(firstNum, secondNum));
                break;
            case '/':
                System.out.println(div(firstNum, secondNum));
                break;
            default:
                System.out.println("Please, enter a valid operation.");
                break;               
        }
    
    }
    
}
