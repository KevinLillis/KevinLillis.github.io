
/**
 * Runtime exception thrown when the remove 
 * operation is attempted on an empty heap.
 * 
 * @author Dr. Lillis
 */
public class EmptyHeapException extends RuntimeException {

    public EmptyHeapException(String e) {
        super(e);
    }
}
