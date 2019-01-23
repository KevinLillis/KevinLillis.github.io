
/**
 * Interface for a generic list.
 * @author Dr. Lillis
 *
 * @param <E> type of element stored in this list
 */
public interface MyList<E> {

    /**
     * Returns the number of elements in this list.
     *
     * @return number of elements in this list
     */
    public int size();

    /**
     * Returns true if this list is empty, returns false otherwise.
     *
     * @return true if this list is empty, returns false otherwise
     */
    public boolean isEmpty();

    /**
     * Returns the first element in this list.
     *
     * @return the first element in this list.
     * @throws IllegalStateException if list is empty.
     */
    public E getFirst() throws IllegalStateException;

    /**
     * Returns the last element in this list.
     *
     * @return the last element in this list
     * @throws IllegalStateException if this list is empty.
     */
    public E getLast() throws IllegalStateException;

    /**
     * Returns the element at the given index position.
     *
     * @param i index of the list element to return
     * @return the element located at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
    public E get(int i) throws IndexOutOfBoundsException;

    /**
     * Adds the given element to the end of this list.
     *
     * @param e element to be added to the end of this list
     */
    public void add(E e);

    /**
     * Adds the given element to the beginning of this list.
     *
     * @param e element to be added to the beginning of this list
     */
    public void addFirst(E e);

    /**
     * Adds the given element to the end of this list.
     *
     * @param e element to be added to the end of this list
     */
    public void addLast(E e);

    /**
     * Adds the given element at the given index position i.
     *
     * @param i index position where the given element will be added
     * @param e element to be added at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &gt; size() Note: that
     * it is OK for i to equal size()
     */
    public void add(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Replaces the first element with the given element and returns the old
     * element.
     *
     * @param e new element that will be stored as the first list element
     * @return element that was previously stored as the first list element
     * @throws IllegalStateException if list is empty.
     */
    public E setFirst(E e) throws IllegalStateException;

    /**
     * Replaces the last element with the given element and returns the old
     * element.
     *
     * @param e new element that will be stored as the last list element
     * @return element that was previously stored as the last list element
     * @throws IllegalStateException if list is empty.
     */
    public E setLast(E e) throws IllegalStateException;

    /**
     * Replaces the element at the given index position with the given element
     * and returns the old element.
     *
     * @param i index of the element to be replaced
     * @param e new element that will be stored at the given index position
     * @return element that was previously stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
    public E set(int i, E e) throws IndexOutOfBoundsException;

    /**
     * Removes and returns the first element in this list.
     *
     * @return first element in this list
     * @throws IllegalStateException if this list is empty.
     */
    public E removeFirst() throws IllegalStateException;

    /**
     * Removes and returns the last element in this list.
     *
     * @return last element in this list
     * @throws IllegalStateException if this list is empty.
     */
    public E removeLast() throws IllegalStateException;

    /**
     * Removes and returns the element at the specified index position in the
     * list.
     *
     * @param i index of element to be removed and returned
     * @return element stored at the given index position
     * @throws IndexOutOfBoundsException if i &lt; 0 or i &ge; size()
     */
    public E remove(int i) throws IndexOutOfBoundsException;

    /**
     * Removes all list elements, if any exist
     */
    public void clear();

    /**
     * Returns true if the specified element in in this list, returns false
     * otherwise.
     *
     * @param e element that is being searched for
     * @return ture if the specified element is in this list, returns false
     * otherwise
     */
    public boolean contains(E e);

    /**
     * Returns the index of the first occurrence of the specified element, -1 if
     * the element is not in this list
     *
     * @param e element being searched for
     * @return index of the first occurrence of the specified element, returns
     * -1 if the element is not in this list
     */
    public int firstIndexOf(E e);

    /**
     * Returns the index of the last occurrence of the specified element, -1 if
     * the element is not in this list not found.
     *
     * @param e element being searched for
     * @return index of the last occurrence of the specified element, returns -1
     * if the element is not in this list
     */
    public int lastIndexOf(E e);

    /**
     * Returns a string containing each element in this list, separated by
     * commas, enclosed in square brackets
     *
     * @return a string representation of this list.
     */
    @Override
    public String toString();
}
