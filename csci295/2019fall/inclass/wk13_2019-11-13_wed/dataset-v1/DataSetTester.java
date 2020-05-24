/**
 *
 * @author Dr. Lillis
 */
import java.util.Scanner;

public class DataSetTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DataSet data = new DataSet();
        
        boolean done = false;
        String userInput;
        
        while(!done){
            System.out.print("Enter value, Q to quit: ");
            userInput = keyboard.next();
            if(userInput.toUpperCase().equals("Q")){
                done = true;
            } else {
                double x = Double.parseDouble(userInput);
                data.add(x);
            }
        }
        
        // Print Results
        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getMaximum());
    }
}
