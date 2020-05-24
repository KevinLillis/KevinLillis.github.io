/**
 * Class to take the measurement of a Coin object.
 * Uses the length of the Coin's name as the measurement.
 *
 * @author Dr. Lillis
 */
public class CoinNameMeasurer implements Measurer {

    /**
     * Uses the length of the coin's name as its measurement.
     * @param obj Assumed to be a Coin object to be measured.
     * @return The length of the coin object's name.
     */
    @Override
    public double measure(Object obj){
        // Must use a Coin reference so we can access the getName() method.
        Coin c = (Coin)obj;
        return c.getName().length();
    }
}
