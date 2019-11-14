/**
 * 
 * @author Dr. Lillis
 * @param <T> Type of elements to be stored in the pair
 */
public class Pair<T> implements MyPair<T>{
    private T first;
    private T second;

    public Pair(T first, T second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public T getFirst() {
        return first;
    }

    @Override
    public T getSecond() {
        return second;
    }

    @Override
    public T setFirst(T newFirst) {
        T oldFirst = first;
        first = newFirst;
        return oldFirst;
    }

    @Override
    public T setSecond(T newSecond) {
        T oldSecond = second;
        second = newSecond;
        return oldSecond;
    }
    
    @Override
    public String toString(){
        String s = "(";
        s += first;
        s += ", ";
        s += second;
        s += ")";
        return s;
    }
}
