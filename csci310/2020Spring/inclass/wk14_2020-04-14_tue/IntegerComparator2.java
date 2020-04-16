
import java.util.Comparator;

/**
 *
 * @author Dr. Lillis
 */
/**
 * Used to order Integers as follows: 
 *    1) All odds come before all evens
 *    2) The odds are sorted from smallest to largest
 *    3) The evens are sorted smallest to largest
 */
class IntegerComparator2 implements Comparator<Integer>{

    @Override
    public int compare(Integer x, Integer y) {
        if (isOdd(x) && isEven(y)){
            return -1;
        }
        
        if (isEven(x) && isOdd(y)){
            return +1;
        }
    
        if(x < y){
            return -1;
        }
        
        if(x > y){
            return +1;
        }
        
        return 0;
    }
    
    private boolean isEven(int x){
        return x % 2 == 0;
    }
    
    private boolean isOdd(int x){
        return x % 2 == 1;
    }
    
}