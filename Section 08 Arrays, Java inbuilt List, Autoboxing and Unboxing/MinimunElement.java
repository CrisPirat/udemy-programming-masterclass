import java.util.Arrays;
import java.util.Scanner; 
public class MinimumElement {  
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in); 
        int capacity;
        capacity= scanner.nextInt();
        return capacity; 
    }
    
    private static int[] readElements(int capacity) {
      int[] array = new int[capacity]; 
    Scanner scanner = new Scanner(System.in); 
      System.out.println("Enter " + capacity +" integer values: \r");
      for(int i=0; i<array.length; i++){
        array[i] = scanner.nextInt();
      }
      return array; 
    }
    
    private static int findMin(int[] array){
        int min;
        if(array.length>0){
            min=array[0];
        }else{
            min =0;
        }
        for(int i=0; i<array.length; i++) {
            if (array[i] < min){
              min =  array[i];
            }
        }
        
        return min;
    }
}