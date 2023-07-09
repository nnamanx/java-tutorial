package ls2;
import java.util.*;

public class Password {
//    Checking whether there are more than 2 digits
    static boolean isDigit(String str){
        int cnt = 0;
        boolean bool = false;
        
        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
            if (Character.isDigit(c)){
                cnt++;
            }
        }
        if(cnt >= 2) {
            bool = true;
        }
        return bool;
    }
//    Checking whether including letters or digits
    static boolean lettersAndDigits(String str){
        boolean bool = false;
        
        for(int i = 0; i < str.length(); i++){
            int c = str.charAt(i);
                
            if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                bool  = true;
            } 
            else {
                bool = false;
                break;
            }
        }     
        return bool;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. A paswword must have at least ten characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
    
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = sc.nextLine();
        
        if((password.length() >= 10) && (lettersAndDigits(password) == true )&& (isDigit(password) == true)){
            System.out.println("Password is valid.");

        } else System.out.println("Password is not valid.");
    }
    
}
