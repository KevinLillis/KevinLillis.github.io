/**
 * Data set Version 2 - Made specifically for BankAccount objects.
 *
 * @author Dr. Lillis
 */
public class BankAccountDataSet {
    private double sum; // sum the values of the account balances in this data set
    private int count; // number of items in this data set
    private BankAccount maximum;
    
    /**
     * Construct an empty data set.
     */
    public BankAccountDataSet(){
        sum = 0;
        count = 0;
        maximum = null;
    }
    
    /**
     * Adds a BankAccount to this data set.
     * @param x the BankAccount to be added to this data set.
     */
    public void add(BankAccount x){
        sum += x.getBalance();
        if(count == 0 || x.getBalance() > maximum.getBalance()){
            maximum = x;
        }
        count++;
    }
    
    /**
     * Returns the average BankAccount balance.
     * @return the average BankAccount balance.
     */
    public double getAveage(){
        if(count == 0){
            return 0;
        } else {
            return sum / count;
        }
    }
    
    /**
     * Returns the BankAccount with the largest balance.
     * @return the BankAccount with the largest balance.
     */
    public BankAccount getMaximum(){
        return maximum;
    }
}
