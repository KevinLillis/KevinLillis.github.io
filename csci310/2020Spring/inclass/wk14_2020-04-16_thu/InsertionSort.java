/**
 *
 * @author Dr. Lillis
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 3, 4, 5, 6, 7, 2};
        Utils.print(numbers);
        insertionSort2(numbers);
        Utils.print(numbers);

        System.out.println("----------------------------------------");
        
        numbers = Utils.randomIntArray(20000, 1, 15000);
        if(Utils.isSorted(numbers)){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        
        insertionSort2(numbers);

        if(Utils.isSorted(numbers)){
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
    }
    


    // Does not do the swap every time, thus reducing the number
    // of copies that are needed.
    public static void insertionSort1(int arr[]){
        int temp, j;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            for(j = i; j > 0 && temp < arr[j-1]; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
        
    }
    
    // Matches the hand-written procedure done in class.
    public static void insertionSort2(int arr[]){
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0 && arr[j] < arr[j-1]; j--){
                Utils.swap(arr, j, j-1);
            }
        }
            
    }
}
