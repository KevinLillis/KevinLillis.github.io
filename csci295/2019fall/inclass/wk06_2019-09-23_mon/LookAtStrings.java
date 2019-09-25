
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class LookAtStrings {
    public static void main(String[] args) {
        // strings1();
        // strings2();
        strings3();
    }
    
    public static void strings1(){
        // Asking how long a string is
        String name = "St. Francis Xavier";
        int numLetters = name.length();
        System.out.printf("%s has %d characters%n", name, numLetters);

        // Print quotes areound the string
        System.out.printf("\"%s\" has %d characters%n", name, numLetters);
        
    }
    
    public static void strings2(){
        // Read strings from the keyboard
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name1 = in.next();
        System.out.println("You entered " + name1);
        
        System.out.print("Enter another name: ");
        String name2 = in.nextLine();
        System.out.println("You entered " + name2);
    }
    
    public static void strings3(){
        // If the commented lines are removed (i.e. the next & nextLine are
        // switched), this doesn't work
        
        // RULE of Thumb: If possible, either uses only next, or only nextLine
        // in the program, with out mixing them.
        
        Scanner in = new Scanner(System.in);
        String name1, name2;
        System.out.print("Enter first name: ");
        //name1 = in.next();
        name1 = in.nextLine();
        System.out.println("You entered: " + name1);
        
        System.out.print("Enter second name: ");
        //name2 = in.nextLine();
        name2 = in.next();
        System.out.println("Yopu entered: " + name2);
    }

}
