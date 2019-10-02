/**
 *
 * @author Dr. Lillis
 */
public class Circle {
    private int radius;
    
    // Constructor
    public Circle(int initialRadius){
        radius = initialRadius;
    }
    
    // "Default" constructor AKA "No-Argument" constructor
    public Circle(){
        radius = 0;
    }
    
    // "Setter" method, AKA a "mutator"
    public void setRadius(int newRadius){
        radius = newRadius;
    }
    
    // "Getter" method, AKA "accessor"
    public int getRadius(){
        return radius;
    }
    
    // Methods for calculated Values
    public double area(){
        return Math.PI * radius * radius;
    }
    
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString(){
        // Return whatever string I fell like
        return "" + radius;
    }
}
