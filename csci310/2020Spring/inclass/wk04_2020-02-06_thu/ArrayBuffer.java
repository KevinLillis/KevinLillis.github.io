/**
 *
 * @author Dr. Lillis
 * @param <E> Type of elements stored in the buffer.
 */
public class ArrayBuffer<E> implements MyCircularBuffer<E> {

    protected E[] array;
    protected int front; // index of first element
    protected int rear; // index of next open spot
    
    public ArrayBuffer(int capacity) {
        if(capacity <= 0){
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }

        array = (E[])new Object[capacity + 1];
        front = rear = 0;
    }
    
    public ArrayBuffer(){
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
        front = (front + array.length - 1) % array.length; // move front back one
        array[front] = e;
    }

    @Override
    public void addRear(E e) {
        if(isFull()){
            throw new BufferFullException("Buffer full. Cannot add " + e + ".");
        }
        
        array[rear] = e;
        rear = (rear + 1) % array.length; // move rear forward one
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

        E temp = array[front];
        front = (front + 1) % array.length; // move front forward one, end wraps to 0
        
        return temp;
    }

    @Override
    public E removeRear() {
        if(isEmpty()){
            throw new BufferEmptyException("Cannot remove from empty buffer.");
        }
        
        rear = (rear + array.length - 1) % array.length;// move rear back one
        return array[rear];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        // Full if rear is one position before front
        return (rear + 1) % array.length == front;
    }

    @Override
    public int capacity() {
        return array.length - 1;
    }

    @Override
    public int size() {
        return (array.length - front + rear) % array.length;
    }

    @Override
    public int free() {
        return capacity() - size();
    }
    
    @Override
    public String toString(){
        int size = size();
        String s = "[";
        boolean first = true;
        int index = front;
        
        for(int i = 0; i < size; i++){
            if(first){
                s += array[index];
                first = false;
            } else {
                s += ", " + array[index];
            }
            index = (index + 1) % array.length; // move index forward one
        }
        s += "]";
        return s;        
    }

}
