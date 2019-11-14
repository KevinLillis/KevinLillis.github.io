/**
 * Data Set Version 5 - A Generic data set that uses generic measurers.
 */

public class DataSet<T> {
    private double sum;
    private int count;
    private T maximum;
    private Measurer<T> measurer;
    
    /**
     * Constructs an empty data set and provided the Measurer that will be
     * used whenever the value of an object in the data set is needed.
     */
    public DataSet(Measurer<T> measurer){
        sum = 0;
        count = 0;
        maximum = null;
        this.measurer = measurer;
    }
    
    /**
     * Adds an object to this dataset. The value of the object is obtained
     * using the Measurer that was provided when the data set was constructed.
     * @param x T to add to this data set.
     */
    public void add(T x){
        sum += measurer.measure(x);
        if(count == 0 || measurer.measure(x) > measurer.measure(maximum)){
            maximum = x;
        }
        count++;
    }
    
    /**
     * Returns the average of the values of the objects added so far.
     * @return the average of the values of the objects added so far.
     */
    public double getAverage(){
        if(count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    /**
     * Returns a reference to the object with the largest value.
     * @return a reference to the object with the largest value. The reference
     * is of type T.
     */
    public T getMaximum(){
        return maximum;
    }
}
