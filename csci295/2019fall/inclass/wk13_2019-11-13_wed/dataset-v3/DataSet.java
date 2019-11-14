/**
 * Data set Version 3 - Each data item is a "Measurable" object
 *
 * @author Dr. Lillis
 */
public class DataSet {
    private double sum;
    private int count;
    private Measurable maximum; // Any object that implements Measurable interface
    
    /**
     * Construct an empty data set.
     */
    public DataSet(){
        sum = 0;
        count = 0;
        maximum = null;
    }
    
    /**
     * Adds a Measurable object to the data set.
     *
     * @param x Object to be added to the data set, it is guaranteed to have
     * a method called getMeasure() that returns a double value.
     */
    public void add(Measurable x){
        sum += x.getMeasure();
        if(count == 0 || x.getMeasure() > maximum.getMeasure()){
            maximum = x;
        }
        count++;
    }
    
    /**
     * Returns the average of the data items added so far; if no data items
     * have been added, returns 0.
     *
     * @return the average of the data items added to the data set so far.
     */
    public double getAverage(){
        if(count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    /**
     * Returns a reference to the object with the largest getMeasure() value.
     * @return a reference to the object with the largest getMeasure() value.
     */
    public Measurable getMaximum(){
        return maximum;
    }
}
