
/**
 * Interface for a generic triple
 * 
 * @param <E1> The type of the first object in the triple
 * @param <E2> The type of the second object in the triple
 * @param <E3> The type of the third object in the triple
 */
public interface MyTriple<E1 extends Comparable, E2 extends Comparable, E3 extends Comparable> extends Comparable {
    /**
     * Returns the first element of the triple.
     * @return the first element of the triple
     */
    public E1 getFirst();
    

    /**
     * Returns the second element of the triple.
     * @return the second element of the triple
     */
    public E2 getSecond();


    /**
     * Returns the third element of the triple.
     * @return the third element of the triple
     */
    public E3 getThird();
    
    
    /**
     * Replaces the first element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the first element
     * @return element that was previously stored as the first element
     */
    public E1 setFirst(E1 e);

    
    /**
     * Replaces the second element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the second element
     * @return element that was previously stored as the second element
     */
    public E2 setSecond(E2 e);

    /**
     * Replaces the third element of the triple with the given element and 
     * returns the old element.
     * @param e element that will become the third element
     * @return element that was previously stored as the third element
     */
    public E3 setThird(E3 e);
    

    /**
     * Returns a string containing the three elements of this triple, each 
     * separated by a comma and a space, enclosed in parentheses.
     * @return 
     */
    @Override
    public String toString();
}
