import java.util.Arrays;
public class ReverseArray {
    private static void reverse(int[] array){
        System.out.print("Array = " + Arrays.toString(array)); 
        int i, k, temp;
        int size = array.length;
        for (i = 0; i < size / 2; i++) { 
            temp = array[i]; 
            array[i] = array[size - i - 1]; 
            array[size - i - 1] = temp; 
        } 
        System.out.print("Reversed array = " + Arrays.toString(array)); 
    }
}