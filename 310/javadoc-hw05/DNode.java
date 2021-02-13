/**
 * A doubly linked node that holds an Integer object.
 * @author Dr. Lillis
 */
public class DNode {
    /**
     * The integer stored in this node.
     */
    protected Integer e;
    
    /**
     * Points to the next DNode.
     */
    protected DNode next;
    
    /**
     * Points to the previous DNode.
     */
    protected DNode previous;
    
    /**
     * Constructs a DNode object with all instance variables set to null.
     */
    protected DNode(){
        e = null;
        next = null;
        previous = null;
    }
}
