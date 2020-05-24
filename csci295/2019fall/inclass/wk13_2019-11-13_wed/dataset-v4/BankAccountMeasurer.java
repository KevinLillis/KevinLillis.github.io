/**
 * Class to take the measurement of a BankAccount object.
 * Uses the bank account's balance as the measurement.
 *
 * @author Dr. Lillis
 */
public class BankAccountMeasurer implements Measurer {

    /**
     * Uses the bank account balance as its measurement.
     * @param obj Assumed to be a BankAccount object to be measured.
     * @return The bank account's balance.
     */
    @Override
    public double measure(Object obj) {
        // Must use a BankAccount reference so we can acces the getBalance() method
        BankAccount account = (BankAccount)obj;
        return account.getBalance();
    }

}
