
import java.util.Comparator;

/**
 * Sorts strings in reverse order
 * @author Dr. Lillis
 */
public class ReverseStringComp implements Comparator<String> {
    
    @Override
    public int compare(String s1, String s2){
        return -s1.compareTo(s2);
    }
}
