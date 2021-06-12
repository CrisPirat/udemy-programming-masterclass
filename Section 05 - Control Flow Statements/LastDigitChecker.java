public class LastDigitChecker {
    public static boolean isValid(int number){
        if(number<10 || number >1000){
            return false;
        }else{
            return true;
        }
    }
    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a)||!isValid(b)||!isValid(c)){
            return false;
        }
        int lastA = a%10;
        int lastB = b%10;
        int lastC = c%10;
        
        if(lastA == lastB ||lastA == lastC ||lastC == lastB ){
            return true;
        }
        return false;
    }
}