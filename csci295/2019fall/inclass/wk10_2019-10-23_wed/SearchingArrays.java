
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */

/**
 * Examples of searching an array. we're searching for "keys", and there
 * are not duplicate keys. The methods return the index where the key was found,
 * or returns a negative number if the key is not in the array.
 */
public class SearchingArrays {
    
    public static void main(String[] args) {
        binarySearchTester();
    }
    
    public static void LinearSearchTester() {
        int[] values = {23, 65, 45, 34, 20, 59, 19, 47, 66, 9, 12, 8, 4};
        System.out.println(Arrays.toString(values));

        int key, expected, result;
        
        key = 34;
        expected = 3;
        result = linearSearch(values, key);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        
        
        key = 20;
        expected = 4;
        result = linearSearch(values, key);
        System.out.println("\nExpected: " + expected);
        System.out.println("Result: " + result);


        key = 100;
        expected = -1;
        result = linearSearch(values, key);
        System.out.println("\nExpected: " + expected);
        System.out.println("Result: " + result);

    }
    
    /**
     * Returns the index in the array where key is found or returns a negative
     * value if the key is not in the array.
     */
    public static int linearSearch(int arr[], int key) {
        for(int index = 0; index < arr.length; index++){
            if (arr[index] == key) {
                return index;
            }
        }
        
        // If we get here, it means the key is not in the array, so return -1
        return -1;
    }    
    

    public static void binarySearchTester(){
        int[] values = {19, 22, 24, 30, 44, 47, 49, 100, 107, 115, 119, 199};
        System.out.println(Arrays.toString(values));
        int key, expected, result;
        
        key = 30;
        expected = 3;
        result = binarySearch(values, key);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        key = 19;
        expected = 0;
        result = binarySearch(values, key);
        System.out.println("\nExpected: " + expected);
        System.out.println("Result: " + result);

        key = 199;
        expected = values.length - 1;
        result = binarySearch(values, key);
        System.out.println("\nExpected: " + expected);
        System.out.println("Result: " + result);

        System.out.println();
        key = 10;
        result = binarySearch(values, key);
        System.out.println("Key = " + key);
        System.out.println("Expected: " + "a negative value");
        System.out.println("Result: " + result);
        System.out.println("Insert " + key + " at " + (-result - 1));

        System.out.println();
        key = 200;
        result = binarySearch(values, key);
        System.out.println("Key = " + key);
        System.out.println("Expected: " + "a negative value");
        System.out.println("Result: " + result);
        System.out.println("Insert " + key + " at " + (-result - 1));
        
        System.out.println();
        key = 50;
        result = binarySearch(values, key);
        System.out.println("Key = " + key);
        System.out.println("Expected: " + "a negative value");
        System.out.println("Result: " + result);
        System.out.println("Insert " + key + " at " + (-result - 1));


    }
    
    /**
     * Returns the index in the array where key is found or returns a negative
     * value if the key is not in the array.
     * 
     * Precondition: The array must be sorted! This only works if the array
     * is sorted in non-descending order .
     */
    public static int binarySearch(int arr[], int key){
        int L = 0;
        int H = arr.length - 1;
        int M;
        
        while (L <= H){
            M = (L + H) / 2;
            if(arr[M] == key){
                return M;
            } else if (key < arr[M]){
                H = M - 1;
            } else {
                L = M + 1;
            }
        }
        
        // We only get here if the key is not in the array
        return -L - 1;
    }

}
