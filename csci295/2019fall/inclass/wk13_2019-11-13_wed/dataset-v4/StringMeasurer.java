/**
 * Class to take the measurement of a String object.
 * Uses the string's length as the measurement.
 *
 * @author Dr. Lillis
 */
public class StringMeasurer implements Measurer {

    /**
     * Uses the string's length as its measurement.
     *
     * @param obj Assumed to be a String object to be measured.
     * @return The string's length value.
     */
    @Override
    public double measure(Object obj) {
        // Must use a String reference so we can access the length() method.
        String s = (String)obj;
        return s.length();
    }
    
}
