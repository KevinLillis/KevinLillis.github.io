/**
 * A buffer of fixed capacity that holds Integer objects.
 * @author Dr. Lillis
 */
public interface CircularBufferInterface {
    // Approprite because all buffers have a capacity
    /**
     * The default capacity of a buffer.
     */
    int DEFAULT_CAPACITY = 10; // compiler sees: public static final int DEF...
    
    
    /**
     * Add element to the rear of the buffer.
     * @param e Element added to the buffer.
     * @throws BufferFullException if buffer is full.
     */
    void add(Integer e) throws BufferFullException;
    
    /**
     * Add element to the front of the buffer.
     * @param e Element added to the buffer.
     * @throws BufferFullException if buffer is full.
     */
    void addFront(Integer e) throws BufferFullException;
    
    /**
     * Add element to the rear of the buffer.
     * @param e Element added to the buffer.
     * @throws BufferFullException if buffer is full.
     */
    void addRear(Integer e) throws BufferFullException;

    /**
     * Remove and return element at the front of the buffer.
     * @return Element at the front of the buffer.
     * @throws BufferEmptyException if buffer is empty.
     */
    Integer remove() throws BufferEmptyException;
    
    /**
     * Remove and return element at the front of the buffer.
     * @return Element at the front of the buffer.
     * @throws BufferEmptyException if buffer is empty.
     */
    Integer removeFront() throws BufferEmptyException;
    
    /**
     * Remove and return element at the rear of the buffer.
     * @return Element at the rear of the buffer.
     * @throws BufferEmptyException if buffer is empty.
     */
    Integer removeRear() throws BufferEmptyException;
    
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
    
   /**
     * Removes all items from this buffer, if any exist.
     */
    void clear();
    
    /**
     * Returns a string showing the contents of this buffer and indicating
     * which end is the front and which end is the rear. The rear of the buffer
     * is on the left (indicated by the single letter R) and the front of the 
     * buffer is on the right (indicated by the single letter F). The buffer
     * items are surrounded by square brackets and are separated by a comma
     * and a space. Here are some examples:
     *    An empty buffer      R [] F
     *    After adding 1       R [1] F
     *    After adding 2       R [2, 1] F
     *    After adding 3       R [3, 2, 1] F
     *    After removing       R [3, 2] F
     *    After removing       R [3] F
     *    After removing       R [] F
     * @return A string representation of this circular buffer
     */
    @Override
    String toString();
}
