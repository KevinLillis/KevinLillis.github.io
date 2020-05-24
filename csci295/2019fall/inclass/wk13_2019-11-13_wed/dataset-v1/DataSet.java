/**
 * Data set Version 1 - Each data items is a double.
 * 
 * @author Dr. Lillis
 */
public class DataSet {
    private double sum; // used to calculate average
    private int count; // also used to calculate average
    private double maximum; // largest value seen.
    
    /**
     * Construct an empty data set.
     */
    public DataSet() {
        sum = 0;
        count = 0;
        maximum = 0; // initial value not used. See add method 
    }
    
    /**
     * Adds a data value to the data set.
     * @param x data value to be added to this data set.
     */
    public void add(double x){
        sum += x;
        if(count == 0 || x > maximum){
            maximum = x;
        }
        count++;
    }
    
    /**
     * Returns the average of the data items added so far; if no data items
     * have been added, returns 0.
     * @return the average of the data items added to the data set so far.
     */
    public double getAverage(){
        if (count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    
    /**
     * Returns the maximum data item added so far, if no data items
     * have been added, returns 0.
     * @return the maximum of the data items added to the data set so far.
     */
    public double getMaximum(){
        return maximum;
    }
}
