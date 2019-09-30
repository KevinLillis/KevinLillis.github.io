
/**
 *
 * @author Dr. Lillis
 */
public class StringStuff {
    public static void main(String[] args) {
        // We already looked at comparaing 2 strings
        // We already looked at the charAt method
        
        //predicateMethods();
        //makeNewStrings();
        searchAString();
        
    }
    
    /**
     * These methods return either true or false
     */
    static void predicateMethods(){
        String str1 = "cat";
        String str2 = "Concat";
        String str3 = "catholic";
        
        boolean answer;
        answer = str2.contains(str1);
        System.out.printf("%s %S contain %s %n", str2, (answer ? "does" : "does not"), str1);

        answer = str3.contains(str1);
        System.out.printf("%s %S contain %s %n", str3, (answer ? "does" : "does not"), str1);

        str2 = "dog";
        answer = str3.contains(str2);
        System.out.printf("%s %S contain %s %n", str3, (answer ? "does" : "does not"), str2);
        
        System.out.println("cat".startsWith("catholic")); // false
        System.out.println("catholic".startsWith("cat")); // true
        
        System.out.println("catholic".endsWith("cat")); // fasle
        System.out.println("Concat".endsWith("cat")); // true
        
        "".isEmpty(); // true
        " ".isEmpty(); // false
        
        " ".isBlank(); // true - contains only white space
        "".isBlank(); // true - even though the string has no white space
    }
    
    static void makeNewStrings(){
        String result;
        
        result = "-".repeat(30);
        System.out.println(result);
        
        
        String river = "Mississippi";
        int start = 5;
        result = river.substring(start);
        System.out.println(result);
        
        int end = 8;
        result = river.substring(start, end);
        System.out.println(result);
        
        end = river.length();
        result = river.substring(start, end);
        System.out.println(result);

        result = river.replace("ss", "XX");
        System.out.println(result);
        
        result = river.replaceFirst("ss", "XX");
        System.out.println(result);
        
        result = river.toLowerCase();
        System.out.println(result);
        
        result = river.toUpperCase();
        System.out.println(result);
        
        
        result = river.strip();  // remove white space from front and end
        result = river.stripLeading(); // remove white spaace just from front
        result = river.stripTrailing(); // remove white space just from end
    }
    
    static void searchAString(){
        System.out.println("Ambrose".indexOf("rose"));
        System.out.println("Ambrose".indexOf("Rose"));
        
        System.out.println("Mississippi".lastIndexOf("ss"));

        int startFrom = 3;
        System.out.println("Mississippi".indexOf("ss", startFrom));
        System.out.println("Mississippi".lastIndexOf("ss", startFrom));
    }
}
