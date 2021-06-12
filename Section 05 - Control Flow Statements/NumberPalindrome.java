public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int r,sum=0,temp;
        if(number<0){
            number= number*-1;
        }
        temp=number;    
        while(number>0){    
            r=number%10;  //getting remainder  
            sum=(sum*10)+r;    
            number=number/10;    
        }    
        if(temp==sum){    
         return true;
        }else{    
        return false;}
    }

}