
/**
 * Interface for a generic ordered pair.
 * @param <S> Type of first item
 * @param <T> Type of second item
 * 
 * @author Dr. Lillis
 */
public interface MyOrderedPair<S, T> {
    /**
     * Returns the first element of the pair.
     * @return the first element of the pair
     */
    public S getFirst();
    

    /**
     * Returns the second element of the pair.
     * @return the second element of the pair
     */
    public T getSecond();


    /**
     * Replaces the first element of the pair to the given element and returns
     * the old element.
     * @param first element that will become the first element
     * @return element that was previously stored as the first element
     */
    public S setFirst(S first);

    
    /**
     * Replaces the second element of the pair to the given element and returns
     * the old element.
     * @param second element that will become the second element
     * @return element that was previously stored as the second element
     */
    public T setSecond(T second);


    /**
     * Returns a string containing the two elements of this pair, separated
     * by a comma and a space, enclosed in parentheses.
     * @return 
     */
    @Override
    public String toString();
}
