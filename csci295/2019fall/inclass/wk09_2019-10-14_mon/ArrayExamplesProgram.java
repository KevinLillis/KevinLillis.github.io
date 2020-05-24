
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Dr. Lillis
 */
public class ArrayExamplesProgram {
    public static void main(String[] args) {
        // Array of int values
        
        // Create the array
        int[] arr = new int[10];
        
        // Print the length of the array
        System.out.println("The length of the arrary is " + arr.length); // not a method
        
        // Change some array values
        arr[0]= 990;
        arr[7] = 24;
        arr[9]= 33;
        
        // print the array
        System.out.println("Array contains");
        System.out.println(Arrays.toString(arr));    
        
        // Initialize the array to 99
        initialize(arr, 99);
        
        System.out.println(Arrays.toString(arr));
        
        arr = randomArray(5);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("The sum is " + sum(arr));
    }
    
    
    public static void initialize(int[] A, int value){
        for(int i = 0; i < A.length; i++){
            A[i] = value;
        }
    }
    
    // Create and return a new array of length n.
    // Each array element will be a random integer from 1 to 2/3 n
    public static int[] randomArray(int n){
        Random gen = new Random();
        
        int[] result = new int[n];
        for(int i = 0; i < result.length; i++){
            int value = gen.nextInt((2*n)/3) + 1;
            result[i] = value;
        }
        
        return result;
    }
    
    public static int sum(int[] myArray){
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return sum;
    }
}
