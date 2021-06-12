public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        int nOne = (int) (numberOne*1000);
        int nTwo = (int) (numberTwo*1000);
        if(nOne==nTwo){
            return true;
        }
        return false;
    }
}