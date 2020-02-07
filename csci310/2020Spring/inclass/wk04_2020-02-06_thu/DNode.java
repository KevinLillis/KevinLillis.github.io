/**
 *
 * @author Dr. Lillis
 * @param <E> Data type of the element stored in this node
 */
public class DNode<E> {
    protected E e;
    protected DNode<E> next;
    protected DNode<E> previous;
    
    protected DNode(){
        e = null;
        next = null;
        previous = null;
    }
}
