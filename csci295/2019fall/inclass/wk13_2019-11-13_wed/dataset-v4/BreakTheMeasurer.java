/**
 *
 * @author Dr. Lillis
 */
public class BreakTheMeasurer {
    public static void main(String[] args) {
        Measurer measureCoin = new CoinValueMeasurer();
        DataSet coinData = new DataSet(measureCoin);

        // This line compiles with no errors because the add method in the 
        // CoinValueMeasurer classes requires a parameter of type Object, and
        // the string "Kevin" is, of course, of type object.
        //
        // But at run-time, the add method in CoinValueMeasurer tries to cast
        // the object provided as a Coin. Since a String cannot be cast as a
        // Coin, we get a run-time error. 
        coinData.add("Kevin");
    }
}
