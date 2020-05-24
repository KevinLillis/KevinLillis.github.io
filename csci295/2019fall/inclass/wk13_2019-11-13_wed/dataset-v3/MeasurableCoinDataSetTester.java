/**
 *
 * @author Dr. Lillis
 */
public class MeasurableCoinDataSetTester {
    public static void main(String[] args) {
        System.out.println("Adding Coins to a DataSet\n");
        
        // Create a data set to hold Coin objects
        DataSet data = new DataSet();
        
        // Create some coins
        Coin p = new Coin(.01, "Penny");
        Coin n = new Coin(.05, "Nickle");
        Coin d = new Coin(.1, "Dime");
        Coin q = new Coin(.25, "Quarter");
        
        // Add the coins to the data set
        data.add(n);
        data.add(q);
        data.add(p);
        data.add(d);
        
        // Get the average value
        double average = data.getAverage();
        System.out.println("Average coin value is " + average);
        
        // Get the coin with the maximum value.
        // Can't use a Coin refernce because not every Measurable object
        // is a Coin. Must use a Measurable reference.
        Measurable max = data.getMaximum();
        
        // Now we can cast the Object as a Coin object. If the Measurable
        // Object is not a Coin, we will likely get a runtime error.
        Coin maxCoin = (Coin)max;
        System.out.println("Name of max coin is " + maxCoin.getName());
        System.out.println("Value of max coin is " + maxCoin.getValue());
        
        // Print using the the Measurable reference
        System.out.println(max);
        
    }
    
    
}
