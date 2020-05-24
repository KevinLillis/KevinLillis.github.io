/**
 * Generic class to take the measurement of a BankAccount object.
 * Uses the bank account's balance as the measurement.
 *
 * @author Dr. Lillis
 */
public class BankAccountMeasurer<T> implements Measurer<BankAccount> {
    /**
     * Uses the bank account balance as its measurement.
     * @param account A BankAccount to be measured.
     * @return The bank account's balance.
     */
    @Override
    public double measure(BankAccount account) {
        return account.getBalance();
    }

}
