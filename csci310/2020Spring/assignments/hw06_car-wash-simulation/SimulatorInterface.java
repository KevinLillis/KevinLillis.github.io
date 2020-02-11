
/**
 * Interface for a car wash simulator.
 * @author Dr. Lillis
 */
public interface SimulatorInterface {

    /**
     * Starts the simulation using a random number generator seeded with the 
     * provided parameter.
     * @param seed seed for the random number generator 
     */
    void runSimulation(int seed);
    
    /**
     * Starts the simulation using a random number generator seeded with the 
     * default seed.
     */
    void runSimulation();
    
    /**
     * After the simulation is complete, returns the number of simulated minutes.
     * @return the number of simulated minutes in the most recent simulation.
     */
    int getSimulatedMinutes();
    
    /**
     * After the simulation is complete, returns the number of cars washed.
     * @return the number of cars washed in the most recent simulation.
     */
    int getNumberOfCarsWashed();

    /**
     * After the simulation is complete, returns the number maximum time a car
     * had to wait.
     * @return the maximum number of minutes a car had to wait in the most
     * recent simulation.
     */
    int getMaxWaitTime();
    
    /**
     * After the simulation is complete, returns the average time cars had to
     * wait.
     * @return the average number of minutes a car had to wait in the most
     * recent simulation.
     */
    double getAverageWaitTime();
    
    /**
     * After the simulation is complete, returns the number of cars that didn't
     * have to wait at all before being washed.
     * @return the number of cars in the most recent simulation that didn't have
     * to wait before being washed.
     */
    int getCarsWithZeroWait();
    
    /**
     * returns a minute by minute log as well as a summary of the most recent
     * simulation. See Homework assignment HW 09 for details.
     * @return 
     */
    String getLog();
}
