/**
 *
 * @author Dr. Lillis
 */
public class WrapperClasses {
    public static void main(String[] args) {
        Integer x = new Integer(12); // This is unnecessary and a bit silly
        System.out.println(x);
        
        Integer y = 13; // This is called "Auto-Boxing"
        
        int a = x; // This is called "Auto-Unboxing"
        
        int b = y;
        
        System.out.printf("x = %d  y = %d  a = %d  b = %d %n", x, y, a, b);
        
        a = 55; // an int
        x = 11; // an Integer object reference
        
        int sum = a + x;
        System.out.println("sum is " + sum);
        
        Integer total = a + x;
        
        sum = 0;
        for(Integer i = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
        
    }
}
