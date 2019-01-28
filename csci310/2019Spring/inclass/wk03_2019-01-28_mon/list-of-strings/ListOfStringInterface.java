/**
 *
 * @author Dr. Lillis
 */
public interface ListOfStringInterface {

    /**
     * Adds the given element to the end of this list.
     *
     * @param str element to be added to the end of this list
     */
     void add(String str);
    
    
    /**
     * Adds the given element at the given index position i.
     *
     * @param i index position where the given element will be added
     * @param str element to be added at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &gt; size() Note: that
     * it is OK for i to equal size()
     */
     void add(int i, String str) throws IndexOutOfBoundsException;


    /**
     * Adds the given element to the beginning of this list.
     *
     * @param str element to be added to the beginning of this list
     */
     void addFirst(String str);


    /**
     * Adds the given element to the end of this list.
     *
     * @param str element to be added to the end of this list
     */
     void addLast(String str);


    /**
     * Removes all list elements, if any exist.
     */
     void clear();


    /**
     * Removes unused capacity by making the capacity equal to the size.
    */
    void compress();


    /**
     * Returns true if the specified element in in this list, returns false
     * otherwise.
     *
     * @param str element that is being searched for
     * @return ture if the specified element is in this list, returns false
     * otherwise
     */
     boolean contains(String str);

    /**
     * Increases the capacity of this ArrayList instance, if necessary, to 
     * ensure that it can hold at least the number of elements specified
     * by the minimum capacity argument.
     * @param minCapacity the desired minimum capacity
     */
     void ensureCapacity(int minCapacity);

    /**
     * Returns the index of the first occurrence of the specified element, -1 if
     * the element is not in this list
     *
     * @param str element being searched for
     * @return index of the first occurrence of the specified element, returns
     * -1 if the element is not in this list
     */
     int firstIndexOf(String str);


    /**
     * Returns the element at the given index position.
     *
     * @param i index of the list element to return
     * @return the element located at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     String get(int i) throws IndexOutOfBoundsException;


    /**
     * Returns the current capacity of this list.
     */
    int getCapacity();
    
    
    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list.
     * @throws IllegalStateException if list is empty.
     */
     String getFirst() throws IllegalStateException;


    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws IllegalStateException if this list is empty.
     */
     String getLast() throws IllegalStateException;


    /**
     * Returns true if this list is empty, returns false otherwise.
     *
     * @return true if this list is empty, returns false otherwise
     */
     boolean isEmpty();


    /**
     * Returns the index of the last occurrence of the specified element, -1 if
     * the element is not in this list not found.
     *
     * @param str element being searched for
     * @return index of the last occurrence of the specified element, returns -1
     * if the element is not in this list
     */
     int lastIndexOf(String str);



    /**
     * Removes and returns the first occurrence of the specified element.Returns 
     * null if the element is not in this list.
     * @param str element to be removed from this list
     * @return the element that was removed
     */
    String remove (String str);
    
    
    /**
     * Removes and returns the element at the specified index position in the
     * list.
     *
     * @param i index of element to be removed and returned
     * @return element stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     String remove(int i) throws IndexOutOfBoundsException;


    /**
     * Removes and returns the first element in this list.
     *
     * @return first element in this list
     * @throws IllegalStateException if this list is empty.
     */
     String removeFirst() throws IllegalStateException;


    /**
     * Removes and returns the last element in this list.
     *
     * @return last element in this list
     * @throws IllegalStateException if this list is empty.
     */
     String removeLast() throws IllegalStateException;


    /**
     * Replaces the element at the given index position with the given element
     * and returns the old element.
     *
     * @param i index of the element to be replaced
     * @param str new element that will be stored at the given index position
     * @return element that was previously stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
     String set(int i, String str) throws IndexOutOfBoundsException;


    /**
     * Replaces the first element with the given element and returns the old
     * element.
     *
     * @param str new element that will be stored as the first list element
     * @return element that was previously stored as the first list element
     * @throws IllegalStateException if list is empty.
     */
     String setFirst(String str) throws IllegalStateException;


    /**
     * Replaces the last element with the given element and returns the old
     * element.
     *
     * @param str new element that will be stored as the last list element
     * @return element that was previously stored as the last list element
     * @throws IllegalStateException if list is empty.
     */
     String setLast(String str) throws IllegalStateException;


    /**
     * Returns the number of elements in this list.
     *
     * @return number of elements in this list
     */
     int size();


    /**
     * Returns a string containing each element in this list, separated by
     * commas, enclosed in square brackets
     *
     * @return a string representation of this list.
     */
    @Override
    String toString();

}
