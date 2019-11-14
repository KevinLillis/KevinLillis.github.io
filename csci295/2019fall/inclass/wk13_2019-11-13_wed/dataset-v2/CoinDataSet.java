/**
 * Data set Version 2 - Made specifically for Coin objects.
 * 
 * @author Dr. Lillis
 */
public class CoinDataSet {
    private double sum; // used to calculate average Coin value
    private int count; // also used to calculate average Coin value
    private Coin maximum; // largest Coin seen.
    
    /**
     * Construct an empty data set.
     */
    public CoinDataSet() {
        sum = 0;
        count = 0;
        maximum = null; 
    }
    
    /**
     * Adds a Coin to the data set.
     * @param c the Coin to be added to this data set.
     */
    public void add(Coin c){
        sum += c.getValue();
        if(count == 0 || c.getValue() > maximum.getValue()){
            maximum = c;
        }
        count++;
    }
    
    /**
     * Returns the average coin value
     * @return the average coin value.
     */
    public double getAverage(){
        if (count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    
    /**
     * Returns the coin with the maximum value.
     * @return the coin with the maximum value.
     */
    public Coin getMaximum(){
        return maximum;
    }
}
