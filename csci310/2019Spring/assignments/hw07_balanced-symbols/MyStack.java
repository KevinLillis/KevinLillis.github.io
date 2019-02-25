
/**
 * Interface for a generic stack.
 * @author Dr. Lillis
 *
 * @param <E> type of element stored in this stack
 */
public interface MyStack<E> {

    /**
     * Adds the given element to the top of the stack.
     *
     * @param e element to be added at to the stack
     */
    public void push(E e);

    /**
     * Removes and returns the element on the top of the stack.
     *
     * @return element stored on the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public E pop() throws EmptyStackException;

    /**
     * Returns, but does not remove, the element at the top of the stack.
     * 
     * @return element at the top of the stack.
     * @throws EmptyStackException if the stack is empty
     */
    E top() throws EmptyStackException;
    
    /**
     * Returns true if this stack is empty, returns false otherwise. This method
     * may not use the size() method or a size variable.
     * @return true if this stack is empty, returns false otherwise
     */
    boolean isEmpty();
 
    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in this stack.
     */    
    int size();
    
    
    
    /**
     * Returns a string containing each element in this stack, separated by
     * commas, enclosed in square brackets, with TOS indicated. The top of the 
     * stack is shown to the left and indicated with "TOS" plus a single space.
     * For example: "TOS [3, 2, 1]"
     *
     * @return a string representation of this stack with TOS indicated.
     */
    @Override
    public String toString();
}
