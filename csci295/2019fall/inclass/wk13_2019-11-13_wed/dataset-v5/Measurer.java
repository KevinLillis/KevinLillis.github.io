/**
 * Generic interface for classes that measure other objects.
 * 
 * @author Dr. Lillis
 * @param <T> Type of objects that can be measured by this measurer.
 */
public interface Measurer<T> {
    
    /**
     * Measures the given object.
     * @param t The object that is being measured.
     * @return The measurement of the given object.
     */
    double measure(T t);
}
