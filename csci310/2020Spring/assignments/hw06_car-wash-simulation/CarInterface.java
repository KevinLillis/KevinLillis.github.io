/**
 *
 * @author Dr. Lillis
 */
public interface CarInterface {
    /**
     * The Notify this car that it has started its wash cycle.
     * @param time The minute when this car started being washed.
     */
    void startWash(int time);
    
    /**
     * Returns the number of minutes from when this car entered the simulation
     * until it started to be washed.
     * @return The time this car spent waiting in the simulation before it started
     * to be washed.
     */
    int waitTime();
    
    /**
     * Returns a string that Reads "Car x" where x is the id number of this car.
     * @return a string that Reads "Car x" where x is the id number of this car.
     */
    @Override
    public String toString();
}
