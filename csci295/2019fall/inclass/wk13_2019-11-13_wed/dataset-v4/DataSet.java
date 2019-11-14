/**
 * Data Set Version 4 - Can hold objects of any type. To accommodate all possible
 * objects, this data set also requires a Measurer to be provided when the data 
 * set is first constructed. The Measurer is then used to get the value of each
 * object that is added. It is up the the user of this class to make sure the 
 * Measurer works on the type of objects being added.
 * 
 * @author Dr. Lillis
 */
public class DataSet {
    private double sum; 
    private int count;
    private Object maximum; // Can be any object
    private Measurer measurer;
    
   /**
      Constructs an empty data set with a given measurer.
      @param measurer the measurer that is used to measure data values
   */
    public DataSet(Measurer measurer) {
        sum = 0;
        count = 0;
        maximum = null;
        this.measurer = measurer;
    }
    
   /**
      Adds a data value to the data set.
      @param x a data value
   */
    public void add(Object x){
        sum += measurer.measure(x);
        if(count == 0 || measurer.measure(x) > measurer.measure(maximum)){
            maximum = x;
        }
        count++;
    }
    
   /**
      Gets the average of the added data.
      @return the average or 0 if no data has been added
   */
    public double getAverage(){
        if (count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    
   /**
      Gets the largest of the added data.
      @return the maximum or 0 if no data has been added
   */
    public Object getMaximum(){
        return maximum;
    }
}
