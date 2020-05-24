/**
 * Generic Class to take the measurement of a Coin object.
 * Uses the coin's value as the measurement.
 *
 * @author Dr. Lillis
 */
public class CoinValueMeasurer<T> implements Measurer<Coin> {
    /**
     * Uses the coin's value as its measurement.
     *
     * @param c A Coin to be measured.
     * @return The coin's value.
     */
    @Override
    public double measure(Coin c){
        return c.getValue();
    }
}
