
public interface QueueInterface<E> {

    
    /**
     * Return the number of elements in the queue.
     * @return number of elements in the queue. 
     */
    public int size();

    /** 
     * Return whether the queue is empty.
     * @return true if the queue is empty, false otherwise. 
     */
    public boolean isEmpty();

    /** 
     * Inspect the element at the front of the queue.
     * @return front element in the queue.  
     * @throws EmptyQueueException if the queue is empty. 
     */
    public E front()
            throws EmptyQueueException;

    /**
     * Add an element at the rear of the queue.
     * @param element to be added.
     */
    public void enqueue(E element);

    /** 
     * Remove and return the element at the front of the queue.
     * @return element removed.
     * @throws EmptyQueueException if queue is empty
     */
    public E dequeue()
            throws EmptyQueueException;
}
