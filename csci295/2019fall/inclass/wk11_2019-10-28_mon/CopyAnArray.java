
import java.util.Arrays;

/**
 *
 * @author Dr. Lillis
 */
public class CopyAnArray {
    public static void main(String[] args) {
        // Copy from source to destination
        
        int[] source = {2, 3, 4, 5, 4, 44, 76, 45, 99, 0, 0, 0, 0};
        int[] destination = new int[source.length];
        
        // Manual way of copying
        for(int i = 0; i < source.length; i++){
            destination[i] = source[i];
        }
        
        destination = new int[source.length]; // reset to initial values
                
        System.out.println("Source:      " + Arrays.toString(source));
        System.out.println("Destination: " + Arrays.toString((destination)));
        
        // A better way to copy an array
        System.arraycopy(source, 0, destination, 0, 3);

        System.out.println("Source:      " + Arrays.toString(source));
        System.out.println("Destination: " + Arrays.toString((destination)));
        
        // Source and destination can be the same array
        // Shift the 44, 76, 45, and 99 to the right by one place
        System.arraycopy(source, 5, source, 6, 4);
        System.out.println("Source:      " + Arrays.toString(source));

    }
}
