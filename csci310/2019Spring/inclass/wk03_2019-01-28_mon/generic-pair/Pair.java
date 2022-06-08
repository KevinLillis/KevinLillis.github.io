/**
 * 
 * @author Dr. Lillis
 * @param <E> Type of elements to be stored in the pair
 */
public class Pair<E> implements MyPair<E>{
    private E first;
    private E second;

    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }
    
    @Override
    public E getFirst() {
        return first;
    }

    @Override
    public E getSecond() {
        return second;
    }

    @Override
    public E setFirst(E newFirst) {
        E oldFirst = first;
        first = newFirst;
        return oldFirst;
    }

    @Override
    public E setSecond(E newSecond) {
        E oldSecond = second;
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
