/**
 *
 * @author Dr. Lillis
 */
public class LookAtMath {
    public static void main(String[] args) {
        // Constants
        double pi = Math.PI;
        double e = Math.E;
        
        // Trig Functions
        double angle = Math.PI / 2; // Notice, angles are measured in radians
        double trigResult;
        
        trigResult = Math.sin(angle);
        System.out.println(trigResult);
        
        double degrees = 180;
        double radians = Math.toRadians(degrees);
        System.out.println(Math.cos(radians));
        
        System.out.println(Math.toDegrees(Math.PI * 2));
        
        // Floor and Cieling
        double number = 2.94;
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
        
        // Hypot
        double x = 3, y = 4;
        double hyp = Math.hypot(x, y);
        System.out.println(hyp);
        
        // Same as
        hyp = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println(hyp);
        
        // Logs
        System.out.println(Math.log(Math.E)); // Log base e (natural Log)
        System.out.println(Math.log10(100)); // Log base 10
        
        // Log base 2 of 256
        double answer = (Math.log10(256)) / (Math.log10(2));
        System.out.println("Log base 2 of 256 is " + answer);
        
        // Max and min
        System.out.println(Math.max(4, 9));
        System.out.println(Math.min(5, 12));
        
    }
}
