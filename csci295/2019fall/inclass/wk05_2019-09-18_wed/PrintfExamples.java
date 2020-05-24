
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class PrintfExamples {
    public static void main(String[] args) {
        //printfExample1();
        //printfExample2();
        //stringFormatting();
        averageThree();
    }
    
    /**
     * Basic printf. Specifiers but with NO FORMATTING
     */
    public static void printfExample1(){
        System.out.printf("With no additional arguments: not worth doing");
        System.out.println();// Just a blank line
        
        /*
        Format Specifiers
            %b  Boolean value
        
            %c  Character
            %C  Character, converted to uppercase
        
            %d  Decimal integer
            %o  Octal integer
            %h  hex integer (lowercase letters)
            %H  HEX integer (uppercase letters)
            %x  hex integer (lowercase letters), same as %h
            %X  HEX integer (uppercase letters), same as %H

            %f  floating point number
            %e  Scientific notation (exponential)
        
            %s  String
            %S  String, converts to uppercase
        
            %n  This isn't a format specifier, it inserts a new line character
            %%  Gives the % sign
        */
        
        // Boolean values
        boolean valid = 4 <= 12;
        System.out.printf("The variable 'valid' is %b%n", valid);
        
        // Characters
        for (char letter = 'a'; letter <= 'd'; letter++){
            System.out.printf("[%c]", letter);
        }
        System.out.println();// Just a blank line
        
        for (char letter = 'a'; letter <= 'd'; letter++){
            System.out.printf("[%C]", letter); // Uppercase
        }
        System.out.println();// Just a blank line


        // Integers
        byte byteValue = 22;
        System.out.printf("The byte value is %d. Now a new line%n", byteValue);
        
        short shortValue = 92;
        System.out.printf("The value is %d. Works for short too%n", shortValue);
        
        long longValue = Long.MAX_VALUE;
        System.out.printf("This is the largest long value: %d %n", longValue);
        
        System.out.println(); // Just a blank line
        // Integers in different bases
        int eightBits = 936;
        System.out.printf("%d Decimal (base 10)%n", eightBits);
        System.out.printf("%o Octal (base 8)%n", eightBits);
        System.out.printf("%h Hex (Base 16)%n", eightBits);
        System.out.printf("%H Hex (Base 16)%n", eightBits);
        System.out.printf("%h Hex (Base 16)%n", eightBits);
        System.out.printf("%H Hex (Base 16)%n", eightBits);
        System.out.printf("%x Hex (Base 16)%n", eightBits);
        System.out.printf("%X Hex (Base 16)%n", eightBits);
        
        System.out.println(); // Just a blank line
        // Floating Point Numbers
        float floatValue = 3.43F; // floating point literal
        System.out.printf("Float value: %f %n", floatValue);
        System.out.printf("Float value scientific notation: %e %n", floatValue);
        
        double doubleValue = 987654321.12;
        System.out.printf("Double value: %f %n", doubleValue);
        System.out.printf("Double value scientific notation: %e %n", doubleValue);
        
        System.out.println(); // Just a blank line
        String message = "Class of '80'";
        System.out.printf("My message is --> %s <---%n", message);
        System.out.printf("In uppercase it's --> %S <---%n", message);
    }
    
    /**
     * Show how to format the numbers
     */
    public static void printfExample2(){
        // Integers
        int intValue = 96;
        // field width of 6, right justified
        System.out.printf("intValue: [%6d] field width = 6%n", intValue);
        
        // field width of 6, left justified
        System.out.printf("intValue: [%-6d] field width =6%n", intValue);

        // Include sign
        // Show sign, field width of 6, right justified
        System.out.printf("intValue: [%+6d] field width = 6%n", intValue);
        
        // Show sign, field width of 6, left justified
        System.out.printf("intValue: [%+-6d] field width = 6%n", intValue);
        
        // Floating Point Numbers
        double doubleValue = 123.456;
        // field width of 12, right justified
        System.out.printf("doubleValue: [%12f] field width=12%n", doubleValue);
        
        // field width of 12, left justified
        System.out.printf("doubleValue: [%-12f] field width=12%n", doubleValue);
        
        // field width of 12, two decimal places, right justified
        System.out.printf("doubleValue: [%12.2f] field width=12%n", doubleValue);
        
        // field width of 12, two decimal places, left justified
        System.out.printf("doubleValue: [%-12.2f] field width=12%n", doubleValue);
        
        // Include sign
        // Sign printed, field width of 12, two decimal places, right justified
        System.out.printf("doubleValue: [%+12.2f] %n", doubleValue);

        // Sign printed, field width of 12, two decimal places, left justified
        System.out.printf("doubleValue: [%+-12.2f] %n", doubleValue);
        
        // Specify just the number of decimal places, but not the field width
        System.out.printf("doubleValue: [%.2f] width unspecfied%n", doubleValue);

        
        System.out.println();
        System.out.println("Repeat above example with negative vlaues");
        // Repeat the above floating examples with negative values
        
        // Integers
        intValue = -96;
        // field width of 6, right justified
        System.out.printf("intValue: [%6d] field width = 6%n", intValue);
        
        // field width of 6, left justified
        System.out.printf("intValue: [%-6d] field width =6%n", intValue);

        // Include sign
        // Show sign, field width of 6, right justified
        System.out.printf("intValue: [%+6d] field width = 6%n", intValue);
        
        // Show sign, field width of 6, left justified
        System.out.printf("intValue: [%+-6d] field width =6%n", intValue);
        

        // Floating Point Numbers
        doubleValue = -123.456;
        // field width of 12, right justified
        System.out.printf("doubleValue: [%12f] field width=12%n", doubleValue);
        
        // field width of 12, left justified
        System.out.printf("doubleValue: [%-12f] field width=12%n", doubleValue);
        
        // field width of 12, two decimal places, right justified
        System.out.printf("doubleValue: [%12.2f] field width=12%n", doubleValue);
        
        // field width of 12, two decimal places, left justified
        System.out.printf("doubleValue: [%-12.2f] field width=12%n", doubleValue);
        
        // Include sign
        // Sign printed, field width of 12, two decimal places, right justified
        System.out.printf("doubleValue: [%+12.2f] %n", doubleValue);

        // Sign printed, field width of 12, two decimal places, left justified
        System.out.printf("doubleValue: [%+-12.2f] %n", doubleValue);
    }
    
    /**
     * Everything you learned about how to format output with printf can be
     * used to create a FORMATTED STRING (not printed, must saved as a string).
     */
    public static void stringFormatting(){
        double doubleValue = 987654321.12;
        
        // This is what we did to PRINT the formatted output
        System.out.printf("Double value: %f %n", doubleValue);

        // We use the exact same idea to create a formatted STRING
        String message = String.format("Double value: %f %n", doubleValue);
        System.out.print(message);
        
        // This would work for all of the above examples.
    }
    
    // Prints the average of three numbers
    public static void averageThree(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter x: ");
        double x = in.nextDouble();

        System.out.print("Enter y: ");
        double y = in.nextDouble();

        System.out.print("Enter z: ");
        double z = in.nextDouble();
        
        String formatString = "The average of %.2f, %.2f, and %.2f is %.2f";
        String message = String.format(formatString, x, y, z, (x+y+z)/3);
        System.out.println(message);

    }

}
