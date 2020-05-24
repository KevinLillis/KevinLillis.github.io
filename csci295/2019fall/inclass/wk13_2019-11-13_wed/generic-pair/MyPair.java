
/**
 * Interface for a generic pair.
 * @author Dr. Lillis
 * 
 * @param <E> type of element to be stored in this pair
 */
public interface MyPair<E> {
    /**
     * Returns the first element of the pair.
     * @return the first element of the pair
     */
    public E getFirst();
    

    /**
     * Returns the second element of the pair.
     * @return the second element of the pair
     */
    public E getSecond();


    /**
     * Replaces the first element of the pair to the given element and returns
     * the old element.
     * @param e element that will become the first element
     * @return element that was previously stored as the first element
     */
    public E setFirst(E e);

    
    /**
     * Replaces the second element of the pair to the given element and returns
     * the old element.
     * @param e element that will become the second element
     * @return element that was previously stored as the second element
     */
    public E setSecond(E e);


    /**
     * Returns a string containing the two elements of this pair, separated
     * by a comma and a space, enclosed in parentheses.
     * @return 
     */
    @Override
    public String toString();
}
