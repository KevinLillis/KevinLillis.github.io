/**
 * Thrown when an application attempts to remove an object from an empty buffer.
 * 
 * @author Dr. Lillis
 */
public class BufferEmptyException extends RuntimeException {

    /**
     * Constructs a BufferEmptyException with the specified detail message.
     * @param s the detail message
     */
    public BufferEmptyException(String s) {
        super(s);
    }

}
