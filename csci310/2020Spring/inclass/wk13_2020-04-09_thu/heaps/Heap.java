
import java.util.Comparator;

public class Heap <E> implements GenericHeapInterface<E>{
    private Comparator<E> comparator;
    private E[] arr = (E[]) new Object[5];
    private int size = 0;
    
    public Heap(Comparator<E> comp){
        comparator = comp;
    }
    
    /**
     * Remove and return the element with the highest priority.
     * @return 
     */
    @Override
    public E remove(){
        if(isEmpty()){
            throw new EmptyHeapException("Cannot remove from an empty heap");
        }
        
        E temp = arr[1]; // item at the root will be returned at the end
        arr[1] = arr[size]; // Move the verty last item into the root
        arr[size] = null; // Blank out the spot where the last item was
        size--;
        
        // Do the "percolate down" procedure
        int hole, childR, childL, childPri;
        hole = 1; // start the hole at the root
        boolean done = false;
        while(hole * 2 < size && !done){ // stop at a leaf node
            if (hole * 2 + 1 <= size) {
                // hole has two children
                childL = hole * 2;
                childR = hole * 2 + 1;
                
                // See which child has the higher priority, call it childPri
                if(comparator.compare(arr[childL], arr[childR]) < 0) {
                    // left child has higher priority
                    childPri = childL;
                }
                else {
                    // right child has higher priority
                    childPri = childR;
                }
                
                // See if childPri has higher priority than the hole, if so swap
                if(comparator.compare(arr[childPri], arr[hole]) < 0){
                    // Yes, childPri is higher prority than the hole, so swap
                    swap(childPri, hole);
                    hole = childPri;
                } else {
                    // No, childPri is NOT higher priority than hold, so end
                    done = true;
                }
            } else {
                // hole has one child (it must be the left child)
                childL = hole * 2;
                
                // See if left child has higher priority than hole, if so swap
                if(comparator.compare(arr[childL], arr[hole]) < 0){
                    // Yes, left child is higher prority than the hole, so swap
                    swap(childL, hole);
                    hole = childL;
                } else {
                    // No, left child is NOT higher priority than hold, so end
                    done = true;
                }
            }
        } // End of percolate down procedure
        
        return temp;
    }
    
    private void swap(int x, int y){
        E temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    
    /**
     * Adds the specified element to this heap.
     * @param e the element to add to this heap
     */
    @Override
    public void add(E e){
        if(size == arr.length - 1){
            doubleArraySize();
        }
        
        size++;
        
        // Do the "percolate up" procedure
        int hole = size; // size is the index of the last array slot
        
        // hole > 1 means we haven't gotten to the root.
        // hole / 2 is the parrent of hole
        while(hole > 1 && comparator.compare(e, arr[hole/2]) < 0){
            arr[hole] = arr[hole/2]; // set hole equal to its parrent
            hole = hole / 2; // now the hole is at the parrent
        }
        arr[hole] = e;
    }
    
    
    @Override
    public int size(){
        return size;
    }
    
    @Override
    public boolean isEmpty(){
        return size == 0;
    }
    
    private void doubleArraySize(){
        E[] temp = (E[]) new Object[size * 2];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }
    
}
