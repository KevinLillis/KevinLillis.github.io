/**
 * @param <S> Type of first item
 * @param <T> Type of second item
 *
 * @author Dr. Lillis
 */
public class OrderedPair<S, T> implements MyOrderedPair<S, T>{
    private S first;
    private T second;

    public OrderedPair(S first, T second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public S getFirst() {
        return first;
    }

    @Override
    public T getSecond() {
        return second;
    }

    @Override
    public S setFirst(S newFirst) {
        S oldFirst = first;
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
