
/**
 * A 24-hour military style clock.
 * @author Dr. Lillis
 */
public interface Clock {
    
    /**
     * Sets the hour of this clock to the specified hour.
     * @param hour the new hour setting for this clock.
     */
    void setHour(int hour);
   
    /**
     * Sets the minute of this clock to the specified minute.
     * @param minute the new minute setting for this clock.
     */
    void setMinute(int minute);
    
    /**
     * Sets the second of this clock to the specified second.
     * @param second the new second setting for this clock.
     */
    void setSecond(int second);
    
    /**
     * Sets the hour, minute, and second of this class to the specified values.
     * @param hour the new hour setting for this clock.
     * @param minute the new minute setting for this clock.
     * @param second the new second setting for this clock.
     */
    void setTime(int hour, int minute, int second);
    
    /**
     * Sets the hour, minute, and second all to zero.
     */
    void reset();
    
    /**
     * Returns the hour value of this clock.
     * @return the hour value of this clock.
     */
    int getHour();
    
    /**
     * Returns the minute value of this clock.
     * @return the minute value of this clock.
     */
    int getMinute();
    
    /**
     * Returns the second value of this clock.
     * @return the second value of this clock.
     */
    int getSecond();
    
    /**
     * Returns a String showing the current time of this clock. The format 
     * of the time should be "h:m:s".
     * @return 
     */
    @Override
    String toString();
}
