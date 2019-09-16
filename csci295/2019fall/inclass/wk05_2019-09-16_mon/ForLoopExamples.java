/**
 *
 * @author Dr. Lillis
 */
public class ForLoopExamples {
    public static void main(String[] args) {
        //example1();
        //example2("Honey, I'm home.");
        //4example3(10);
        //example4(100,200);
        example5();
    }
    
    public static void example1(){
        System.out.println("Before entering the for loop");
        System.out.println("----------------------------");

        for (int i = 0; i < 10; i++){
            System.out.println("i = " + i);
        }
        
        System.out.println("After exiting the for loop");
        System.out.println("----------------------------");
        
    }
    
    public static void example2(String message){
        // Print a message 10 time
        for(int j = 0; j < 10; j++){
            System.out.println(message);
        }
    }
    
    public static void example3(int n){
        // calculates and prints the sum from 1 to n
        int sum = 0;
        for(int number = 1; number <= n; number++){
            sum += number;
        }
        
        System.out.println("Sum from 1 to " + n + " = " + sum);
    }

    public static void example4(int low, int high){
        // calculates and prints the sum from low to high
        int sum = 0;
        for(int number = low; number <= high; number++){
            sum += number;
        }
        
        System.out.println("Sum from " + low + " to " + high + " = " + sum);
    }
    
    public static void example5(){
        // Nested loops
        int iCount = 4; // this is how many times the outer loop executes
        int jCount = 5; // this is how many times the inner loop executes
        
        System.out.println("Before the outer loop");
        for (int i = 0; i < iCount; i++){
            System.out.println("    Inside the outer loop - before the inner loop");
            
            for(int j = 0; j < jCount; j++){
                System.out.println("        Inside the inner loop. i=" + i + " j=" + j);
            }
            
            System.out.println("    Inside the outer loop - after the inner loop");
        }
    }

}
