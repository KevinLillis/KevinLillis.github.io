/**
 *
 * @author Dr. Lillis
 */
public class LookAtChars {
    public static void main(String[] args) {
        char ch;
        int asciiCode;
        
        ch = 'a';
        System.out.println(ch + " " + ++ch + " " + ++ch);
        
        asciiCode = 'a';
        System.out.println(asciiCode);
        
        for(ch = 'a'; ch < 'g'; ch++){
            System.out.println("Ascii code for " + ch + " is " + (int)ch);
        }
    }
}
