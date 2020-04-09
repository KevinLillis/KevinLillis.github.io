
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */
public class SortingWithJava {
    public static void main(String[] args) {
        // Sorting Strings
        String[] words = {"frank", "category", "elaine", "tj", "catholic", "jack", 
                            "agatha", "joe", "cat", };
        
        System.out.println(Arrays.toString(words));
        Arrays.sort(words, new LengthComparator());
        System.out.println(Arrays.toString(words));
        
        // Sorting Integers
        Integer[] values = {3,4,3,2,34,4,5,6,67,6,5,4,34,3,4,5,5,45,45,45,4,54};
        System.out.println(Arrays.toString(values));
        Arrays.sort(values, new ReverseIntegerComparator());
        System.out.println(Arrays.toString(values));
        
    }
}
