/**
 *
 * @author kevin
 */
public class Methods {
    public static void main(String[] args) {
        int value1 = 12;
        int value2 = 99;
        
        System.out.println("larger is " + larger(value1, value2));
        
        int a = 1, b = 4, c = 12;
        
        System.out.println(larger(a, b, c));
        
        double d = 1.1, e = 4.4;
        System.out.println(larger(d, e));
    }
    
    public static int larger(int x, int y) {
        if (x > y){
            return x;
        } else {
            return y;
        }
    }
    
    // An overloaded method
    public static int larger(int x, int y, int z){
        return larger(x, larger(y, z));
    }
    
    public static int larger(double x, double y) {
        if (x > y){
            return (int)x;
        } else {
            return (int)y;
        }
    }
    
}
