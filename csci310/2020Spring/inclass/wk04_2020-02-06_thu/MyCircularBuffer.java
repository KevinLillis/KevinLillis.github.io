/**
 *
 * @author Dr. Lillis
 * @param <E> Type of elements stored in the buffer.
 */
public interface MyCircularBuffer<E> {
    // Approprite because all buffers have a capacity
    int DEFAULT_CAPACITY = 4; // compiler sees: public static final int DEF...
    
    
    /**
     * Add element to the rear of the buffer.
     * @param e Element added to the buffer.
     */
    void add(E e);
    
    /**
     * Add element to the front of the buffer.
     * @param e Element added to the buffer.
     */
    void addFront(E e);
    
    /**
     * Add element to the rear of the buffer.
     * @param e Element added to the buffer.
     */
    void addRear(E e);

    /**
     * Remove and return element at the front of the buffer.
     * @return Element at the front of the buffer.
     */
    E remove();
    
    /**
     * Remove and return element at the front of the buffer.
     * @return Element at the front of the buffer.
     */
    E removeFront();
    
    /**
     * Remove and return element at the rear of the buffer.
     * @return Element at the rear of the buffer.
     */
    E removeRear();
    
    /**
     * Returns true if this buffer is empty, returns false otherwise.
     *
     * @return true if this buffer is empty, returns false otherwise
     */
    boolean isEmpty();
            
    /**
     * Returns true if this buffer is full, returns false otherwise.
     *
     * @return true if this buffer is full, returns false otherwise
     */
    boolean isFull();
    
    /**
     * Returns the capacity of this buffer.
     * @return capacity of this buffer
     */
    int capacity();
    
    /**
     * Returns the number of elements in this buffer.
     *
     * @return number of elements in this buffer
     */
    int size();
    
    /**
     * Returns the number of elements that can be added to this buffer before
     * it becomes full.
     * @return the number of element that can be added to this buffer before it
     * becomes full
     */
    int free();
    
    @Override
    String toString();
}
