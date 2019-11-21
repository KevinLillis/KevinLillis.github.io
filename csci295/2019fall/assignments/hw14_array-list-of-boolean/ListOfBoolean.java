/**
 *
 * @author Dr. Lillis
 */
public interface ListOfBoolean {

    /**
     * Adds the given element to the end of this list.
     *
     * @param bool element to be added to the end of this list
     */
     void add(Boolean bool);
    
    
    /**
     * Adds the given element at the given index position i.
     *
     * @param i index position where the given element will be added
     * @param bool element to be added at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &gt; size() Note: that
     * it is OK for i to equal size()
     */
     void add(int i, Boolean bool) throws IndexOutOfBoundsException;


    /**
     * Adds the given element to the beginning of this list.
     *
     * @param bool element to be added to the beginning of this list
     */
     void addFirst(Boolean bool);


    /**
     * Adds the given element to the end of this list.
     *
     * @param bool element to be added to the end of this list
     */
     void addLast(Boolean bool);


    /**
     * Removes all list elements and sets the capacity to the default capacity.
     */
     void clear();


    /**
     * Removes unused capacity by making the capacity equal to the size.
    */
    void compress();


    /**
     * Increases the capacity of this ArrayList instance, if necessary, to 
     * ensure that it can hold at least the number of elements specified
     * by the minimum capacity argument.
     * @param minCapacity the desired minimum capacity
     */
     void ensureCapacity(int minCapacity);

    /**
     * Returns the element at the given index position.
     *
     * @param i index of the list element to return
     * @return the element located at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     Boolean get(int i) throws IndexOutOfBoundsException;


    /**
     * Returns the current capacity of this list.
     * @return the capacity of this list.
     */
    int getCapacity();
    
    
    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list.
     * @throws IllegalStateException if list is empty.
     */
     Boolean getFirst() throws IllegalStateException;


    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws IllegalStateException if this list is empty.
     */
     Boolean getLast() throws IllegalStateException;


    /**
     * Returns true if this list is empty, returns false otherwise.
     *
     * @return true if this list is empty, returns false otherwise
     */
     boolean isEmpty();


    /**
     * Removes and returns the element at the specified index position in the
     * list.
     *
     * @param i index of element to be removed and returned
     * @return element stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     Boolean remove(int i) throws IndexOutOfBoundsException;


    /**
     * Removes and returns the first element in this list.
     *
     * @return first element in this list
     * @throws IllegalStateException if this list is empty.
     */
     Boolean removeFirst() throws IllegalStateException;


    /**
     * Removes and returns the last element in this list.
     *
     * @return last element in this list
     * @throws IllegalStateException if this list is empty.
     */
     Boolean removeLast() throws IllegalStateException;


    /**
     * Replaces the element at the given index position with the given element
     * and returns the old element.
     *
     * @param i index of the element to be replaced
     * @param bool new element that will be stored at the given index position
     * @return element that was previously stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     Boolean set(int i, Boolean bool) throws IndexOutOfBoundsException;


    /**
     * Replaces the first element with the given element and returns the old
     * element.
     *
     * @param bool new element that will be stored as the first list element
     * @return element that was previously stored as the first list element
     * @throws IllegalStateException if list is empty.
     */
     Boolean setFirst(Boolean bool) throws IllegalStateException;


    /**
     * Replaces the last element with the given element and returns the old
     * element.
     *
     * @param bool new element that will be stored as the last list element
     * @return element that was previously stored as the last list element
     * @throws IllegalStateException if list is empty.
     */
     Boolean setLast(Boolean bool) throws IllegalStateException;


    /**
     * Returns the number of elements in this list.
     *
     * @return number of elements in this list
     */
     int size();


    /**
     * Returns a String containing each element in this list, separated by
     * commas, enclosed in square brackets
     *
     * @return a String representation of this list.
     */
    @Override
    String toString();

}
