/**
 *
 * @author Dr. Lillis
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] numbers = {1, 9, 3, 4, 5, 6, 7, 2};
        Utils.print(numbers);
        selectionSort(numbers);
        Utils.print(numbers);

        System.out.println("----------------------------------------");
        
        numbers = Utils.randomIntArray(20000, 1, 15000);
        if(Utils.isSorted(numbers)){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        
        selectionSort(numbers);

        if(Utils.isSorted(numbers)){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }

    }
    
    /**
     * Selection Sort. Sorts the given array in place.
     * @param arr 
     */
    public static void selectionSort(int arr[]){
        int minIndex;
        for(int i = 0; i < arr.length - 1; i++){
            // Find index of smallest element in unsorted section
            minIndex = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            
            Utils.swap(arr, minIndex, i);
        }
    }
}
