public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        int last=0;
        int first = number;
        while (first >= 10) {
            last = first % 10;
            first = first / 10;
            if(last%2==0){
                sum += last;
            }
        }
        if(first%2==0){
                sum += first;
            }
        return sum;
    }
}