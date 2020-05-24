/**
 * Class to take the measurement of a Coin object.
 * Uses the coin's value as the measurement.
 *
 * @author Dr. Lillis
 */
public class CoinValueMeasurer implements Measurer {
    /**
     * Uses the coin's value as its measurement.
     *
     * @param obj Assumed to be a Coin object to be measured.
     * @return The coin's value.
     */
    @Override
    public double measure(Object obj){
        // Must use a Coin reference so we can access the getValue() method.
        Coin c = (Coin)obj;
        return c.getValue();
    }
}
