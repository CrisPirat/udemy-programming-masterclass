public class IntEqualityPrinter {
    public static void printEqual(int one, int two, int three){
        if (one < 0 ||two < 0 || three < 0){
            System.out.print("Invalid Value");
        }else if(one== two && one == three){
            System.out.print("All numbers are equal");
        }else if(one != two && one != three && two != three){
            System.out.print("All numbers are different");
        }else{
            System.out.print("Neither all are equal or different");
        }
    }
}