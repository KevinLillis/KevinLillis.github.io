
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class LoopingExample {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = keyboard.nextInt();

        System.out.print("Enter second number: ");
        int y = keyboard.nextInt();
        
        System.out.println("Sum from " + x + " to " + y + " is " + sum1(x, y));
        System.out.println("Sum from " + x + " to " + y + " is " + sum2(x, y));
        System.out.println("Sum from " + x + " to " + y + " is " + sum3(x, y));
        System.out.println("Sum from " + x + " to " + y + " is " + sum4(x, y));
        System.out.println("Sum from " + x + " to " + y + " is " + sum5(x, y));
    }

    public static int sum1(int a, int b) {
        // This uses a while loop, but the code is ugly and confusing
        int low, high;
        
        if (a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
        
        int total = 0;
        int numValues; // this is the number of values we need to add up
        numValues = (high - low) + 1;
        
        int counter = 0;
        int value = low;
        
        while (counter < numValues){
            total += value;
            value += 1;
            counter += 1;
        }
        
        return total;
        
    }
    
    public static int sum2(int a, int b) {
        // This uses a while loop, but the code looks much better
        int low, high;
        
        if (a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
        
        int total = 0;        
        int value = low;
        
        while (value <= high){
            total += value;
            value += 1;
        }
        
        return total;
        
    }


    public static int sum3(int a, int b) {
        // This uses a while loop, use post-increment value++
        int low, high;
        
        if (a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
        
        int total = 0;        
        int value = low;
        
        while (value <= high){
            total += value++;
        }
        
        return total;
        
    }

    public static int sum4(int a, int b) {
        // Now we can force a <= b by swapping the vales of a and b if needed
        if (a > b) {
            // Swap the values of a and b
            int oldA = a;
            a = b;
            b = oldA;
        } 
        
        int total = 0;        
        int value = a;
        
        while (value <= b){
            total += value++;
        }
        
        return total;
        
    }

    public static int sum5(int a, int b) {
        // Now we can force a <= b by making the function call itself
        if (a > b) {
            return sum5(b,a);
        } 
        
        int total = 0;        
        int value = a;
        
        while (value <= b){
            total += value++;
        }
        
        return total;
        
    }

    
}
