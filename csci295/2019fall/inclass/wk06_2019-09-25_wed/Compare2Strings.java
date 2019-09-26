
import java.util.Scanner;
import java.util.*;
import java.time.*;

/**
 *
 * @author Dr. Lillis
 */
public class Compare2Strings {
    public static void main(String[] args) {
        // Uncomment a method call to see what the method does.
        
        //dontUseEqualEqual();
        //equalsMethod();
        //compareToMethod();
    }
    
    /**
     * This is an example of why you shouldn't use == to compare two strings
     */
    static void dontUseEqualEqual(){
        Scanner in = new Scanner(System.in);
        
        // For this example, I entered Bob for both names.
        // This creates *Two Different* String objects. 
        System.out.print("Enter a name: ");
        String name1 = in.next();
        
        System.out.print("Enter a name: ");
        String name2 = in.next();
        
        // If the following two lines are uncomments, then the String Objects
        // referenced by name1 and name2 are put into the common pool Of
        // Strings. After that, even though this program has four String 
        // references, they all reference the same String object.
        
        // name1 = name1.intern();
        // name2 = name2.intern();
        
        // This says Bob and Bob are different.
        // That's because == is comparing the *Object References*, not the
        // sequence of characters in each string. Since name1 and name2
        // are two different objects, the references are different.
        if (name1 == name2){
            System.out.printf("%s and %s are the same %n", name1, name2);
        } else {
            System.out.printf("%s and %s are different %n", name1, name2);
        }

        // This creates just one string object.
        System.out.println("");
        String name3 = "Bob";
        String name4 = "Bob";
        
        // This prints Bob and bob are the same, because name3 and name4
        // both reference the same String object.
        if (name3 == name4){
            System.out.printf("%s and %s are the same %n", name3, name4);
        } else {
            System.out.printf("%s and %s are different %n", name3, name4);
        }
        
        // This says Bob and bob are different because name1 and name3
        // referene two different objects.
        System.out.println();
        if (name1 == name3){
            System.out.printf("%s and %s are the same %n", name1, name3);
        } else {
            System.out.printf("%s and %s are different %n", name1, name3);
        }
    }    
    
    /**
    This shows the proper way to see if two objects have the same values.
    */
    static void equalsMethod(){
        String s1, s2, s3;
        s1 = "Bob";
        s2 = "bob";
        s3 = "Fred";
        
        if(s1.equals(s2)){
            System.out.printf("%s and %s are the same %n", s1, s2);
        } else {
            System.out.printf("%s and %s are different %n", s1, s2);
        }
            

        if(s3.equals(s2)){
            System.out.printf("%s and %s are the same %n", s3, s2);
        } else {
            System.out.printf("%s and %s are different %n", s3, s2);
        }
        
        // Ignores the case when comparing the two Strings
        if(s1.equalsIgnoreCase(s2)){
            System.out.printf("%s and %s are the same, not considering case %n", s1, s2);
        } else {
            System.out.printf("%s and %s are different %n", s1, s2);
        }
    }    
    
    /**
    Here is how you compare two Objects to see which one comes first when
    sorting.
    */
    static void compareToMethod(){
        String s1, s2, s3;
        s1 = "cat";
        s2 = "dog";

        if(s1.compareTo(s2) < 0){
            System.out.printf("%s comes before %s %n", s1, s2);
        } else if(s1.compareTo(s2) == 0) {
            System.out.printf("%s and %s are the same %n", s1, s2);
        } else {
            System.out.printf("%s comes before %s %n", s2, s1);
        }
            
        // Can also compare and ignore case
        s1.compareToIgnoreCase(s2);
    }
}
