
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] values = {43, 23, 23, 56, 3, 56, 67, 902, 13, 12};
        System.out.println(Arrays.toString(values));
        
        mergeSort(values);
        System.out.println(Arrays.toString(values));
    }
    
    public static void mergeSort(int arr[]){
        //
        if(arr.length == 1){
            return;
        }
        
        int lenLeft = arr.length / 2;
        int lenRight = arr.length - lenLeft;
        
        int[] left = new int[lenLeft];
        int[] right = new int[lenRight];
        
        System.arraycopy(arr, 0, left, 0, lenLeft);
        System.arraycopy(arr, lenLeft, right, 0, lenRight);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(left, right, arr);
    }
    
    public static void merge(int[] arr1, int[] arr2, int[] merged){
        // Assumes arr1 and arr2 are sorted
        // Assumes arr1.length + arr2.length == merged.length
        
        int i=0, j=0, k=0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                i++;
            } else {
                merged[k] = arr2[j];
                j++;
            }
            k++;
        }
        
        // See which one finished first, and blindly copy the rest of the other one
        if(i == arr1.length){
            // arr1 finished first, copy the rest of arr2
            System.arraycopy(arr2, j, merged, k, arr2.length - j);
        } else {
            // arr2 finished first, copy the rest of arr1
            System.arraycopy(arr1, i, merged, k, arr1.length - i);
        }
        
    }
}
