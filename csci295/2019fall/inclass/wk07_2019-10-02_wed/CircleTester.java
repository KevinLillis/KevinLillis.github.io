/**
 *
 * @author Dr. Lillis
 */
public class CircleTester {
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(20);
        Circle c3 = new Circle(30);
        Circle c4 = new Circle();
        
        
        System.out.println("c1 has radius " + c1 );
        System.out.println("c2 has radius " + c2 );
        System.out.println("c3 has radius " + c3 );
        System.out.println("c4 has radius " + c4 );

        
        System.out.println();
        System.out.println("Area of c1 is " + c1.area());
        System.out.println("Area of c2 is " + c2.area());
        System.out.println("Area of c3 is " + c3.area());
        System.out.println("Area of c4 is " + c4.area());
        
        
        System.out.println();
        System.out.println("Circumference of c1 is " + c1.circumference());
        System.out.println("Circumference of c2 is " + c2.circumference());
        System.out.println("Circumference of c3 is " + c3.circumference());
        System.out.println("Circumference of c4 is " + c4.circumference());
    }
}
