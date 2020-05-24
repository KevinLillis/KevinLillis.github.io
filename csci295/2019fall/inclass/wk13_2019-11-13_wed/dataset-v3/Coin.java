/**
 *
 * @author Dr. Lillis
 */
public class Coin implements Measurable {
    private double value;
    private String name;
    
    public Coin(double value, String name){
        this.value = value;
        this.name = name;
    }
    
    public double getValue(){
        return value;
    }
    
    public String getName(){
        return name;
    }
    
    public void setValue(double value){
        this.value = value;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return name + ", " + value;
    }

    @Override
    public double getMeasure() {
        return value;
    }
}
