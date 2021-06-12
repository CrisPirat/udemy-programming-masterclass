public class NumberToWords {
    public static int reverse(int number){
        int r,sum=0,temp;
        temp=number;    
        if(number<0){
            number= number*-1;
        }
        while(number>0){    
            r=number%10;  //getting remainder  
            sum=(sum*10)+r;    
            number=number/10;    
        }    
        if(temp<0){
            sum=sum*-1;
        }
        return sum;
    }
    public static int getDigitCount(int number){
        if(number <0){
            return -1;
        }
        int count=0;
        if(number==0){
            return 1;
        }
        while(number>0){
            number=number/10; 
            count++;
        }
        return count;
        
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number),r=0;
        int size=getDigitCount(number);
    
        for(int i=1;i<=size;i++ ){   
                r = reverseNumber % 10;
                reverseNumber=reverseNumber / 10;
            switch(r){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }   
    }
}