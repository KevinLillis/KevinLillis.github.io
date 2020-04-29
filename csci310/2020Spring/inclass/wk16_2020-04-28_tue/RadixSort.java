import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        //example1();
        //example2();
        example3();
    }
    
    public static void example1(){
        int[] anArray = {63, 43, 8, 45, 33, 92, 25};
        int numDigits = 2; // k = 2
        int radix = 10;
        
        System.out.println(Arrays.toString(anArray));
        radixSort(anArray, numDigits, radix);
        System.out.println(Arrays.toString(anArray));

    }
    
    public static void example2(){
        // 1000 numbers, each from 1 to 500
        int[] anArray = Utils.randomIntArray(1000, 1, 500);
        int numDigits = 3; // k = 3
        int radix = 10;
        
        System.out.println("Sorted Before: " + Utils.isSorted(anArray));
        radixSort(anArray, numDigits, radix);
        System.out.println("Sorted After : " + Utils.isSorted(anArray));

    }    
    
    public static void example3(){
        // 10,000 numbers, each from 1 to 5,000,000
        int[] anArray = Utils.randomIntArray(10000, 1, 5000000);
        int numDigits = 7; // k = 7
        int radix = 10;
        
        System.out.println("Sorted Before: " + Utils.isSorted(anArray));
        radixSort(anArray, numDigits, radix);
        System.out.println("Sorted After : " + Utils.isSorted(anArray));

    }        
    
    public static void radixSort(int[] arr, int numDigits, int radix){
        // Make an array of lists. There should be radix number of lists
        ArrayList<Integer>[] digits = (ArrayList<Integer>[]) new ArrayList[radix];

        // Create 10 new lists
        for(int i = 0; i < radix; i++){
            digits[i] = new ArrayList<>();
        }
        
        // Now we can start sorting
        for(int position = 0; position < numDigits; position++){
            // Sort current position
            for(int number : arr){
                digits[getDigit(number, position)].add(number);
            }
            
            // copy back to arr
            int j = 0;
            for(int i = 0; i < radix; i++){
                for(int number : digits[i]){
                    arr[j] = number;
                    j++;
                }
                digits[i].clear();
            }
        }
        
    }// end of radix sort method
    
    public static int getDigit(int number, int position){
        return number / (int)Math.pow(10, position) % 10;
    }
}
