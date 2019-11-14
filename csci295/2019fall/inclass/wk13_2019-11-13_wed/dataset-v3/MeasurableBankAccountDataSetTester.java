/**
 *
 * @author Dr. Lillis
 */
public class MeasurableBankAccountDataSetTester {
    public static void main(String[] args) {
        System.out.println("Adding BankAccounts to a DataSet\n");
        
        // Create a data set to hold BAnkAccount objects
        DataSet data = new DataSet();
        
        // Create some BankAccounts
        BankAccount ba1 = new BankAccount(10);
        BankAccount ba2 = new BankAccount(33);
        BankAccount ba3 = new BankAccount(5);
        BankAccount ba4 = new BankAccount(25);
        
        // Add the BankAccounts to the data set
        data.add(ba4);
        data.add(ba2);
        data.add(ba1);
        data.add(ba3);
        
        // Get the average balance
        double average = data.getAverage();
        System.out.println("Average balance is " + average);
        
        // Get the BankAccount with the maximum balance.
        // Can't use a BankAcclount refernce because not every Measurable object
        // is a BankAccount. Must use a Measurable reference.
        Measurable max = data.getMaximum();
        
        // Now we can cast the Object as a BankAccount object. If the Measurable
        // Object is not a BankAccount, we will likely get a runtime error.
        BankAccount maxAccount = (BankAccount)max;
        System.out.println("Balance of the max Account is " + maxAccount.getBalance());
        
        // Print using the the Measurable reference
        System.out.println(max);
        
    }
    
    
}
