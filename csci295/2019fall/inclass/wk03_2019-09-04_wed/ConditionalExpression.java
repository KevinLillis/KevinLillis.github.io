
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ConditionalExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        int x = in.nextInt();
        
        System.out.print("Enter y: ");
        int y = in.nextInt();
        
        
        int larger = x > y ? x : y ;
        System.out.println("The nunbers are " + x + " and " + y);
        System.out.println("The larger is " + larger);
        
        System.out.println();
        
        System.out.println("x is " + (x % 2 == 0 ? "Even" : "Odd"));
    }
    
}
