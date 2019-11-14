/**
 * Generic Class to take the measurement of a Coin object.
 * Uses the length of the Coin's name as the measurement.
 *
 * @author Dr. Lillis
 */
public class CoinNameMeasurer<T> implements Measurer<Coin> {

    /**
     * Uses the length of the coin's name as its measurement.
     * @param c A Coin to be measured.
     * @return The length of the coin's name.
     */
    @Override
    public double measure(Coin c){
        return c.getName().length();
    }
}
