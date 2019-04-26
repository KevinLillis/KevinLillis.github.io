/**
 * Interface for HW 14 in CSCI-310, Spring 2019
 * Duplicate items are allowed in the priority queue.
 * Lower numeric values are considered to have higher priorities.
 * 
 * @author Dr. Lillis
 */
public interface PriorityQueueOfIntegers {
    /**
     * Adds the given item to this priority queue.
     * @param item The item that will be added to this priority queue.
     */
    void add(int item);
    
    /**
     * Removes and returns the item with the highest priority. If the priority
     * queue is empty, throws a custom exception called EmptyPriorityQueueException.
     * @return The item with the highest priority.
     * @throws EmptyPriorityQueueException
     */
    int remove();
    
    /**
     * Returns the number of items in this priority queue.
     * @return the number of items in this priority queue.
     */
    int size();
    
    /**
     * Returns true if this priority queue contains no items and returns false
     * otherwise.
     * @return true if this priority queue contains no items, returns false otherwise.
     */
    boolean isEmpty();
}