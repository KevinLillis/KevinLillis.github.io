
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dr. Lillis
 * @param <E>
 */
public interface SetI<E> extends Cloneable {
    /**
     * Adds element e to this set; Has no effect if the element is already
     * in this set.
     * @param e Element to add to this set.
     */
    void add(E e);
    
    
    /**
     * Returns the number of elements in this set.
     * @return The number of elements in this set.
     */
    int card();
    
    
    /**
     * Removes all elements from this set; Has no effect if this set is empty.
     */
    void clear();
    
    
    /**
     * Returns true if e is an element of this set.
     * @param e Element whose presence in this set is to be tested .
     * @return true if e is an element of this set.
     */
    boolean contains(E e);
    
    
    /**
     * Returns a new set containing every element that is in this set and not
     * in other.
     * @param other Set to be combined with this set.
     * @return A new set containing every element that is in this set and not
     * in other.
     */
    
    
    SetI<E> difference(SetI<E> other);
    /**
     * Removes element e from this set; Has no effect if the element is not
     * in this set.
     * @param e Element to remove from this set.
     */
    void discard(E e);
    
    
    /**
     * Compares the specified object with this list for equality.
     * @param o The object to be compared for equality with this set.
     * @return true if the specified object is equal to this set.
     */
    @Override
    boolean equals(Object o);
    
    
    /**
     * Returns a new Set containing every element that is in this set AND 
     * is in other.
     * @param other Set to be combined with this set.
     * @return A new Set containing every element that is in this set AND 
     * is in other.
     */
    SetI<E> intersection(SetI<E> other);
    /**
     * Returns True if this set has no elements in common with other.
     * @param other the set to compare with this set.
     * @return True if this set has no elements in common with other.
     */
    boolean isDisjoint(SetI<E> other);
    
    
    /**
     * Returns True if every element in this set is also in other and there is
     * at least one element in other that is not in this set.
     * @param other the set to compare with this set.
     * @return True if this set is a proper subset of other.
     */
    boolean isProperSubset(SetI<E> other);
    
    
    /**
     * Returns True if every element in other is also in this set and there is
     * at least one element in this set that is not in other.
     * @param other the set to compare with this set.
     * @return True if this set is a proper superset of other.
     */
    boolean isProperSuperset(SetI<E> other);
    
    
    /**
     * Returns True if every element in this set is also in other.
     * @param other the set to compare with this set.
     * @return True if every element in this set is also in other.
     */
    boolean isSubset(SetI<E> other);
    
    
    /**
     * Returns True if every element in other is also in this set.
     * @param other the set to compare with this set.
     * @return True if every element in other is also in this set.
     */
    boolean isSuperset(SetI<E> other);
    
    
    /**
     * Removes and returns an arbitrary element from this set.
     * @return An arbitrary element from this set.
     * @throws EmptySetException Because element cannot be removed from an empty set.
     */
    E pop() throws EmptySetException;
    
    
    /**
     * Returns a new set containing all subsets of this set.
     * @return A new set containing all subsets of this set.
     */
    SetI<SetI<E>> powerSet();
    
    
    /**
     * Returns a new set containing every element that is in either the set or
     * other but not both.
     * @param other Set to be combined with this set.
     * @return A new set containing every element that is in either the set or
     * other but not both.
     */
    SetI<E> symmetricDifference(SetI<E> other);
    
    
    /**
     * Returns an array containing all of the elements in this set.
     * @param arr Will place elements in this array if they will fit, otherwise
     * will create a new array.
     * @return an array containing all of the elements in this set.
     */
    public E[] toArray(E[] arr);
    
    
    /**
     * Returns a string representation of this set. The string representation
     * consists of a list of the set's elements in arbitrary order, enclosed in 
     * curly braces ("{}"). Adjacent elements are separated by the characters
     * ", " (comma and space). 
     * @return A a string representation of this set.
     */
    @Override
    String toString();
    
    
    /**
     * Returns a new Set containing every element that is in this set OR
     * is in other.
     * @param other Set to be combined with this set.
     * @return A new Set containing every element that is in this set or in other.
     */
    SetI<E> union(SetI<E> other);

    /**
     * Return a copy of this set.
     * @return A copy of this set
     */
    Object clone();
    
    /**
     * Returns a list containing all of the element in this list.
     * @return A list containing all of the element in this list.
     */
    List<E> toList();
    
    /**
     * Returns true if this list is empty.
     * @return true if this list is empty.
     */
    boolean isEmpty();
    
    /**
     * Returns a new Set containing all elements in the given array.
     * @param array Contains the elements to be included in the returned Set.
     * @return a new Set containing all elements in the given array.
     */
    SetI<E> factory(E[] array);
}
