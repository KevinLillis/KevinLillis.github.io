
import java.util.ArrayList;

/**
 *
 * @author Dr. Lillis
 */
public class LookAtArrayLists {
    public static void main(String[] args) {
        // Creating a new ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.ensureCapacity(9);
        
        // Show its size
        System.out.println("number of elements in the list: " + names.size());
        
        // Add a bunch of strings to the ArrayList
        for (int i = 0; i < 6; i++){
            names.add("name_" + i);
        }
        
        System.out.println(names);
        System.out.println("number of elements in the list: " + names.size());
        
        // Add strings at specific index locations
        names.add(0, "Doreen");
        System.out.println(names);
        
        names.add(6, "Dan");
        System.out.println(names);
        
        names.add(8, "Tim");
        System.out.println(names);
        
        names.add(names.size(), "John");
        System.out.println(names);
        
        
        // Get values out of the ArrayList
        System.out.println("The name at position zero is " + names.get(0));
        
        // See if the ArrayList cotains a specific string
        System.out.println("Does the list of names contain Jack?");
        if(names.contains("Jack")){
            System.out.println("Yes - Jack is in the list");
        } else {
            System.out.println("Nopd - Jack isn't in the list");
        }
        
        System.out.println("Is Tim in the list");
        System.out.printf("%s in the list %n", 
            names.contains("Tim") ? "Yes Tim is" : "No Tim is not");
        
        // Remove items from the ArrayList
        names.remove(1);
        System.out.println(names);
        
        names.remove("Tim");
        System.out.println(names);
        
        System.out.println("Is the list empty?");
        if (names.isEmpty()){
            System.out.println("Yes - it's empty");
        } else {
            System.out.println("No - it's not empty");
        }
        
        // Remove all items from the this
        /* // Using a while loop
        while(!names.isEmpty()){
            names.remove(0);
        }
        */

        /* //Using a for loop
        int size = names.size();
        for(int i = 0; i < size; i++){
            names.remove(0);
        }
        */
        
        // Using the built-in method
        names.clear();
        
        System.out.println(names);
        
        
    }
    
}
