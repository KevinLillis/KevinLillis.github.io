
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */
public class BianarySearch {

    public static void main(String[] args) {
        String foundMessage = "Key %d found at %d%n";
        String notFoundMessage = "Insert key %d at position %d%n";
        
        int[] values = {19, 22, 24, 30, 44, 47, 49, 100, 107, 115, 119, 199};
        System.out.println(Arrays.toString(values) + "\n");
        
        int key, result;

        System.out.println("Iterative Binary Search");
        key = 30;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 19;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 199;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 10;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 200;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 50;
        result = binarySearch(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }
        
        //========================================================================
        
        System.out.println("\nRecursive Binary Search");
        key = 30;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 19;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 199;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 10;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 200;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

        key = 50;
        result = binarySearchRec(values, key);
        if(result >= 0){
            System.out.printf(foundMessage, key, result);
        } else {
            System.out.printf(notFoundMessage, key, -result - 1);
        }

    }

    /**
     * Returns the index in the array where key is found or returns a negative
     * value if the key is not in the array.
     *
     * Precondition: The array must be sorted! This only works if the array is
     * sorted in non-descending order .
     */
    public static int binarySearch(int arr[], int key) {
        int L = 0;
        int H = arr.length - 1;
        int M;

        while (L <= H) {
            M = (L + H) / 2;
            if (arr[M] == key) {
                return M;
            } else if (key < arr[M]) {
                H = M - 1;
            } else {
                L = M + 1;
            }
        }

        // We only get here if the key is not in the array
        return -L - 1;
    }

    public static int binarySearchRec(int arr[], int key){
        return binarySearchRec(arr, key, 0, arr.length - 1);
    }
    
    public static int binarySearchRec(int arr[], int key, int L, int H) {
        if (L > H) {
            return -L - 1;
        }

        int M = (L + H) / 2;
        if (arr[M] == key) {
            return M;
        } else if (key < arr[M]) {
            return binarySearchRec(arr, key, L, M - 1);
        } else {
            return binarySearchRec(arr, key, M + 1, H);
        }
    }

}

