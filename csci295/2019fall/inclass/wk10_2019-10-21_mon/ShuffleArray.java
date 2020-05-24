
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Dr. Lillis
 */
public class ShuffleArray {
    public static void main(String[] args) {
        // Make an array
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println(Arrays.toString(myArray));
        
        // Shuffle
        shuffle(myArray);

        // Print the array again to verify it's shuffled
        System.out.println(Arrays.toString(myArray));

    }
    
    public static void shuffle(int[] arr){
        Random gen = new Random();
        for(int i = 0; i <= arr.length - 2; i++){
            int j = gen.nextInt(arr.length - i) + i;
            swap(arr, i, j);
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        // Swap values at index i and index j
        // Does not check to make sure i and j are valid
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
