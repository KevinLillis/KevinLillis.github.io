/**
 *
 * @author Dr. Lillis
 * @param <E> Type of elements stored in the buffer.
 */
public class LinkedBuffer<E> implements MyCircularBuffer<E> {

    protected DNode<E> front; // Node with first element
    protected DNode<E> rear; // Node where next element will be stored
    protected int capacity;
    protected int size;
    
    public LinkedBuffer(int capacity) {
        if(capacity <= 0){
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }

        this.capacity = capacity;
        size = 0;
        
        front = new DNode();
        rear = front;
        
        for(int i = 0; i < capacity; i++){
            rear.next = new DNode();
            rear.next.previous = rear;
            rear = rear.next;
        }
        rear.next = front;
        rear.next.previous = rear;
        rear = rear.next; // now rear == front
    }
    
    public LinkedBuffer(){
        this(DEFAULT_CAPACITY);
    }
    
    
    @Override
    public void add(E e){
        addRear(e);
    }
    
    @Override
    public void addFront(E e) {
        if(isFull()){
            throw new BufferFullException("Buffer full. Cannot add " + e + ".");
        }
        front = front.previous; // move front back one
        front.e = e;
        size++;
    }

    @Override
    public void addRear(E e) {
        if(isFull()){
            throw new BufferFullException("Buffer full. Cannot add " + e + ".");
        }
        
        rear.e = e;
        rear = rear.next; // move rear forward one
        size++;
    }

    @Override
    public E remove(){
        return removeFront();
    }
    
    @Override
    public E removeFront() {
        if(isEmpty()){
            throw new BufferEmptyException("Cannot remove from empty buffer.");
        }

        E temp = front.e;
        front = front.next; // move front forward one
        
        size--;
        return temp;
        
    }

    @Override
    public E removeRear() {
        if(isEmpty()){
            throw new BufferEmptyException("Cannot remove from empty buffer.");
        }
        
        rear = rear.previous;// move rear back one
        size--;
        return rear.e;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return rear.next == front;
    }

    @Override
    public int capacity() {
        return capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int free() {
        return capacity - size;
    }
    
    @Override
    public String toString(){
        String s = "[";
        boolean first = true;
        DNode<E> current = front;
        
        for(int i = 0; i < size; i++){
            if(first){
                s += current.e.toString();
                first = false;
            } else {
                s += ", " + current.e.toString();
            }
            current = current.next;
        }
        s += "]";
        return s;        
    }

}
