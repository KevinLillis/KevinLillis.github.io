/**
 *
 * @author kevin
 */
public class IncDec {
    public static void main(String[] args) {
        int x, y;
        
        // Post-Increment
        x = 10;
        y = x++;
        System.out.println("Post-Increment");
        System.out.println("x = " + x + "   y = " + y);
        
        // Pre-Increment
        x = 10;
        y = ++x;
        System.out.println("Pre-Increment");
        System.out.println("x = " + x + "   y = " + y);
        
        // Post-Decrement
        x = 10;
        y = x--;
        System.out.println("Post-Decrement");
        System.out.println("x = " + x + "   y = " + y);
        
        // Pre-Decrement
        x = 10;
        y = --x;
        System.out.println("Pre-Decreent");
        System.out.println("x = " + x + "   y = " + y);
        
    }
    
}
