public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >23 || hourOfDay< 0){
            return false;
        }
        if (hourOfDay == 6){
            return false;
        }
        if(hourOfDay >22 || hourOfDay< 8){
            return true;
        }
        return false;
    }
 
}