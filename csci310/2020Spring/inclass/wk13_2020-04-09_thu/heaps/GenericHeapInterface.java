/**
 *
 * @author Dr. Lillis
 * @param <E> Type of elements stored in this heap
 */
public interface GenericHeapInterface<E> {
     /**
     * Adds the specified element to this heap.
     * @param element the element to add to this heap.
     */
    void add(E element);

     /**
     * Removes and returns the element with the highest priority.
     * @return element with the highest priority.
     * @throws EmptyHeapException when trying to remove from an empty heap.
     */
    E remove();
    
    /**
     * Returns the number of elements stored in this heap.
     * @return number of elements in this heap.
     */
    int size();
    
    /**
     * Returns true if there are no elements in this heap, false otherwise.
     * @return true if there are no elements in this heap, false otherwise.
     */
    boolean isEmpty();
}
