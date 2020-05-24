
import java.util.Scanner;


/**
 *
 * @author kevin
 */
public class Area {
    public static void main(String[] args){
        // Read radius from user

        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the radius: "); // Note: use print, not println
        double radius = keyboard.nextDouble();
        
        // Compute area of circle
        double area = Math.PI * radius * radius;
        
        // Print output
        System.out.println("A circle with radius " 
                + radius
                + " has an area of " 
                + area
        );
    }
}
