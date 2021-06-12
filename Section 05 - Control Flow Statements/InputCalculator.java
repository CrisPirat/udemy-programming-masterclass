import java.util.Scanner;
 
public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner sc=new Scanner(System.in);
        int sum=0,counter=0;
        double avg;
        while(true){
            boolean ifint=sc.hasNextInt();
            if(ifint) {
                int i = sc.nextInt();
                sum+=i;
                counter++;
            } else{
                break;
            }
        }
        System.out.print("SUM = "+sum);
        if(sum==0){
            avg=0;
        }else {
            avg = (double) sum / counter;
        }
        System.out.println(" AVG = "+Math.round(avg));
        sc.close();
    }
}