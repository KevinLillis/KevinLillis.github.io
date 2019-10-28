
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        //return s1.length() - s2.length();
        
        int length1 = s1.length();
        int length2 = s2.length();
        
        if(length1 < length2){
            // s1 comes first
            return -1;
        } else if (length1 > length2){
            // s2 comes first
            return +1;
        } else {
            return s1.compareTo(s2);
        }
    }
    
}
