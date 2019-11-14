/**
 * Generic class to take the measurement of a String object.
 * Uses the string's length as the measurement.
 *
 * @author Dr. Lillis
 */
public class StringMeasurer<T> implements Measurer<String> {

    @Override
    public double measure(String s) {
        return s.length();
    }
    
}
