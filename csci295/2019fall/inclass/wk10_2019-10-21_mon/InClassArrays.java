
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */
public class InClassArrays {
    public static void main(String[] args) {
//        initialArrayValues();
//        enhancedForLoop();
        sumArray();
    }
    
    public static void initialArrayValues(){
        int[] arr1 = {4, 6, 4, 8, 6, 4, 3, 5, 7};
        System.out.println("arr1: " + Arrays.toString(arr1));
        
        int[] arr2 = new int[5];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i + 6;
        }
        System.out.println("arr2: " + Arrays.toString(arr2));
        
        // Array literal
        int[] arr3; // reference variable, initialezed to null.
        arr3 = new int[] {4, 5, 4, 5, 6, 7, 6};
        System.out.println("arr3: " + Arrays.toString(arr3));
        
        // Use an array without every creating a variable
        System.out.println(Arrays.toString(new int[] {10, 11, 12, 13}));

        
        
    }
    
    public static void enhancedForLoop(){
        // This is the enhanced for loop for arrays. Also call a for-each loop
        int[] myArray = {10, 20, 30, 40, 50, 60};
        
        // So something with each array element
        for(int dummy : myArray){
            System.out.println(dummy);
        }
        
        System.out.println(Arrays.toString(myArray));
    }
    
    public static void sumArray(){
        int[] myArr = new int[100];
        
        // Fill the array with the values from 1 to 100
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = i + 1;
        }
        
        // Using Enhanced for loop
        int sum = 0;
        for(int num : myArr){
            sum += num;
        }
        
        System.out.println("sum = " + sum);
        
        
        // Do it again without using enhanced for loop
        sum = 0;
        for(int i = 0; i < myArr.length; i++){
            sum += myArr[i];
        }
        
        System.out.println("sum is still " + sum);
    }
    
}
