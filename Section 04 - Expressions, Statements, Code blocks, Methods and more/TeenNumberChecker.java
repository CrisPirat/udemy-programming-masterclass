public class TeenNumberChecker {
    public static boolean isTeen(int value){
        if((value>=13 && value<=19)){
            return true;
        }
        return false;
    }
    public static boolean hasTeen(int one, int two, int three){
        if(isTeen(one)||isTeen(two)||isTeen(three)){
            return true;
        }
        return false;
    }
}