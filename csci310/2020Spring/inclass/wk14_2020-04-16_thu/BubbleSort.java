/**
 *
 * @author Dr. Lillis
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort 3");
        int[] values = {1, 2, 3, 4, 5, 6, 7, 9, 8};
        Utils.print(values);
        
        int passes = bubbleSort3(values);

        Utils.print(values);
        
        System.out.println("Passes: " + passes);
    }
    
    
    /** Bubble sort with No Optimization
     */
    public static void bubbleSort1(int[] arr){
        for(int pass = 0; pass < arr.length; pass++){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    Utils.swap(arr, i, i+1);
                }
            }
            
        }
    }
    
    
    /**
     * Bubble Sort: Optimized so it doesn't check the already sorted portion
     * @param arr 
     */
    public static void bubbleSort2(int[] arr){
        for(int pass = 0; pass < arr.length; pass++){
            for(int i = 0; i < arr.length - 1 - pass; i++){
                if(arr[i] > arr[i + 1]){
                    Utils.swap(arr, i, i+1);
                }
            }
        }
    }
    
    
    public static int bubbleSort3(int[] arr){
        boolean needsAnotherPass = true;
        int passCount = 0;
        
        for(int pass = 0; pass < arr.length && needsAnotherPass; pass++){
            passCount++;
            needsAnotherPass = false;
            for(int i = 0; i < arr.length - 1 - pass; i++){
                if(arr[i] > arr[i + 1]){
                    Utils.swap(arr, i, i+1);
                    needsAnotherPass = true;
                }
            }
        }
        return passCount;
    }
    
    
}
