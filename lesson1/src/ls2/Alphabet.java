package ls2;
public class Alphabet {
    
    static void alphabet(){
        for(int i = 65; i <= 122; i++){
            if(i >= 91 && i<= 96){
                continue;
            }else 
                System.out.println((char)i);
        }
    }
    
    public static void main(String[] args){
        alphabet();
        
    }
}
