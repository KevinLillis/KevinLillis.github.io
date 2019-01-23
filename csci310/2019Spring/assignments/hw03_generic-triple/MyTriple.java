
/**
 * Interface for a generic triple
 * 
 * @param <E> type of element to be stored in this triple
 */
public interface MyTriple<E> {
    /**
     * Returns the first element of the triple.
     * @return the first element of the triple
     */
    public E getFirst();
    

    /**
     * Returns the second element of the triple.
     * @return the second element of the triple
     */
    public E getSecond();


    /**
     * Returns the third element of the triple.
     * @return the third element of the triple
     */
    public E getThird();
    
    
    /**
     * Replaces the first element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the first element
     * @return element that was previously stored as the first element
     */
    public E setFirst(E e);

    
    /**
     * Replaces the second element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the second element
     * @return element that was previously stored as the second element
     */
    public E setSecond(E e);

    /**
     * Replaces the third element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the third element
     * @return element that was previously stored as the third element
     */
    public E setThird(E e);
    

    /**
     * Returns a string containing the three elements of this triple, each 
     * separated by a comma and a space, enclosed in parentheses.
     * @return 
     */
    @Override
    public String toString();
}
