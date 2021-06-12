public class SharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if(one<10 || one > 99 ||two<10 || two > 99){
            return false;
        }
        int a =one;
        int b=two;
         boolean answer = false;
      int lefta = a/10;
      int righta = a % 10;
      int leftb = b/10;
      int rightb = b % 10;
      if(lefta == leftb || lefta == rightb || righta == leftb || righta == rightb){
        answer = true;  
      }
      return answer;
    }
}