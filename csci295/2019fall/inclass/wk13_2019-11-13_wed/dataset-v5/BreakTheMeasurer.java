/**
 *
 * @author Dr. Lillis
 */
public class BreakTheMeasurer {
    public static void main(String[] args) {
        CoinValueMeasurer<Coin> cm = new CoinValueMeasurer<>();
        
        DataSet<Coin> ds = new DataSet<>(cm);
        
        // When the following line is un-commented it causes a Compile-Time error.
        // That is much better than a run-time error we saw in version 4.
        //ds.add("Kevin");
    }
}
