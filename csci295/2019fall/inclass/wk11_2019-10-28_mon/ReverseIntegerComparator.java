import java.util.Comparator;

public class ReverseIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer x, Integer y) {
        return y - x;
    }
    
}
