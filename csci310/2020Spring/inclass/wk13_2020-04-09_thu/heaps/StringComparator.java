
import java.util.Comparator;

/**
 *
 * @author Dr. Lillis
 */
/**
 * Used to order strings by length, shortest to longest. All strings of
 * the same length are ordered in reverse lexicographical order.
 */
class StringComparator implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()){
            return -1;
        }
        
        if (s1.length() > s2.length()){
            return +1;
        }
    
        if(s1.compareToIgnoreCase(s2) > 0){
            return -1;
        }

        if(s1.compareToIgnoreCase(s2) < 0){
            return 1;
        }
        
        return 0;
    }
    
}