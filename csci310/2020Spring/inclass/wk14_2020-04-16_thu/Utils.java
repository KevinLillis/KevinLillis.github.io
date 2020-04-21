/**
 *
 * @author Dr. Lillis
 */

// =============================================================================
//  __   __  _______  ___   ___      ___   _______  ___   _______  _______ 
// |  | |  ||       ||   | |   |    |   | |       ||   | |       ||       |
// |  | |  ||_     _||   | |   |    |   | |_     _||   | |    ___||  _____|
// |  |_|  |  |   |  |   | |   |    |   |   |   |  |   | |   |___ | |_____ 
// |       |  |   |  |   | |   |___ |   |   |   |  |   | |    ___||_____  |
// |       |  |   |  |   | |       ||   |   |   |  |   | |   |___  _____| |
// |_______|  |___|  |___| |_______||___|   |___|  |___| |_______||_______|
    

public class Utils {
    /**
     * Creates are returns an int array of length n filled with random numbers
     * in the value low <= r <= high.
     */
    public static int[] randomIntArray(int n, int low, int high){
        int range = high - low + 1;
        int shift = low;
        
        // create and fill hte array
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * range) + shift;
        }
        
        return arr;
    }
    
    /**
     * Returns true if the array is sorted and returns false if the array
     * is not sorted.
     */
    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Swap elements arr[i] and arr[j]
     */
    public static void swap(int[] arr, int i, int j){
        int old_i = arr[i];
        arr[i] = arr[j];
        arr[j] = old_i;
    }
    
    public static void print(int[] arr){
        System.out.println(java.util.Arrays.toString(arr));
    }
}
