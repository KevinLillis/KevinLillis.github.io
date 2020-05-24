import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a non-neg intger: ");
        int number = input.nextInt();
        
        boolean isEven = number % 2 == 0;
        
        if(isEven){
            System.out.println(number + " is even");
            System.out.println("Which means number = 2k");
        } else {
            System.out.println(number + " is odd");
            System.out.println("Which means number = 2k + 1");
        }


        
        


    }
}
