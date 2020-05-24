/**
 *
 * @author Dr. Lillis
 */
public class Version2DataSetTester {
    public static void main(String[] args) {
        // Make a new coin data set
        CoinDataSet coinData = new CoinDataSet();
        
        // Make three coins
        Coin p = new Coin(.01, "Penny");
        Coin d = new Coin(.1, "Dimne");
        Coin q = new Coin(.25, "Quarter");
        
        // Add all three to the data set
        coinData.add(p);
        coinData.add(d);
        coinData.add(q);
        
        System.out.println("Average = " + coinData.getAverage());
        
        Coin largest = coinData.getMaximum();
        System.out.println("Maximum is " + largest);
        
        
        System.out.println("Testing some Bank Accounts\n\n");
        BankAccountDataSet accountData = new BankAccountDataSet();
        
        // Make three bank accounts and add them immediately to the data set.
        accountData.add(new BankAccount(10));
        accountData.add(new BankAccount(150));
        accountData.add(new BankAccount(99));
        
        System.out.println("Average account balance is " + accountData.getAveage());
        System.out.println("Account with largest balance is " + accountData.getMaximum());
    }
}
