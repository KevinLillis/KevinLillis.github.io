
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dr. Lillis
 */
public class ArrayListSet<E> implements SetI<E>, Cloneable {

    private ArrayList<E> list;
    // Four Constructors
    
    /**
     * Constructs an empty set.
     */
    public ArrayListSet(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Constructs a set which contains a single element.
     * @param e The element to be added to this new set.
     */
    public ArrayListSet(E e){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Constructs a set which contains all elements in the provided list.
     * @param list Contains all elements that are to be added to this new set.
     */
    public ArrayListSet(List<E> list){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Constructs a set which contains all elements in the provided array.
     * @param array Contains all elements that are to be added to this new set.
     */
    public ArrayListSet(E[] array){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void add(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int card() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetI<E> difference(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void discard(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public SetI<E> intersection(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDisjoint(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean isProperSubset(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isProperSuperset(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSubset(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isSuperset(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
    public SetI<SetI<E>> powerSet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    
    @Override
    public SetI<E> symmetricDifference(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E[] toArray(E[] arr) {
        return list.toArray(arr);
    }

    
    @Override
    public SetI<E> union(SetI<E> other) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null){
            return false;
        }
        
        if(this.getClass() != otherObject.getClass()){
            return false;
        }
        
        SetI otherSet = (SetI) otherObject;
        
        return this.isSubset(otherSet) && otherSet.isSubset(this);
    }    
    
    
    @Override
    public String toString(){
        String s = list.toString();
        s = "{" + s.substring(1,s.length()-1) + "}";
        return s;
    }
    
    @Override
    public List<E> toList(){
        return (ArrayList<E>)list.clone();
    }

    @Override
    public Object clone() {
        try {
            SetI<E> cloned = (SetI<E>) super.clone(); // makes shallow copy

            // Deep copy
            this.list = (ArrayList<E>) list.clone();
            return cloned;
        } catch (CloneNotSupportedException e){
            // We'll never get here because we implement Cloneable
            return null;
        }
    }    
    
    @Override
    public boolean isEmpty(){
        return this.card() == 0;
    }
    
    @Override
    public SetI<E> factory(E [] array){
        ArrayListSet<E> set = new ArrayListSet<>(array);
        return set;
    }

}
