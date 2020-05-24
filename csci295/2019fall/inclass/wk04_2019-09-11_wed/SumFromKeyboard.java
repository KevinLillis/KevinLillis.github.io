
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class SumFromKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Enter an integer, 0 to quit: ");
        int number = in.nextInt();
        boolean finished = false;


        if (number == 0){
            finished = true;
        }
        
        
        while(!finished){
            total += number;
            
            System.out.print("Enter an integer, 0 to quit: ");
            number = in.nextInt();
            if (number == 0){
                finished = true;
            }
            
        }
        
        System.out.println("Total is " + total);
    }
}
