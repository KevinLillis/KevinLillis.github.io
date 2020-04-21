/**
 *
 * @author Dr. Lillis
 */
public class MergeSort {
    
    public static void main(String[] args) {
        int[] numbers = {4, 5, 1, 3, 7, 6, 5, 4, 45, 7, 6, 4, 3};
        
        Utils.print(numbers);
        
        mergeSort(numbers);
        
        Utils.print(numbers);
        
    }

    public static void mergeSort(int[] arr){
        // Check for base case
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
        // Assume merged.length == arr1.length + arr2.length
        
        int i = 0, j = 0, k = 0;
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                merged[k] = arr1[i];
                i++;
                k++;
            } else {
                merged[k] = arr2[j];
                j++;
                k++;
            }
        } // end of while loop
        
        // See which one finished first
        
        if(i == arr1.length){
            // i got to the end of arr1 first. Copy rest of arr2 using j

            for(int p = j; p < arr2.length; p++){
                merged[k] = arr2[p];
                k++;
            }
        } else {
            // j to to then end of arr2 first. Copy rest of arr1 using i

            for(int p = i; p < arr1.length; p++){
                merged[k] = arr1[p];
                k++;
            }
        }
    }
    
}
