/**
 *
 * @author Dr. Lillis
 */public class MeasurerDataSetTester {
    public static void main(String[] args) {
        
        /* --------------- Strings --------------- */
        // Make the measurer and data set
        Measurer<String> measureString = new StringMeasurer();
        DataSet<String> stringData = new DataSet(measureString);
        
        // Add strings to the data set
        stringData.add("Hello World");
        stringData.add("What time is it Mr. Fox");
        stringData.add("To boldly go where no man has gone before");
        stringData.add("May the Force be with you");

        // Display some results
        System.out.println("---- Strings ----");
        
        double averageLength = stringData.getAverage();
        System.out.println("Average String Length = " + averageLength);

        String maxString = stringData.getMaximum();
        System.out.println("Max String = " + maxString);
        System.out.println("Length of max string = " + maxString.length());

        /* --------------- Coins Measured by Values --------------- */
        Measurer<Coin> measureCoin = new CoinValueMeasurer();
        DataSet<Coin> coinData; // We'll use this variable for two examples
        
        coinData = new DataSet<Coin>(measureCoin);

        Coin p = new Coin(.01, "Wheat-Back Penny");
        Coin d = new Coin(.1, "Dime");
        Coin q = new Coin(.25, "Quarter");

        coinData.add(p);
        coinData.add(q);
        coinData.add(d);
        
        System.out.println("\n---- Coins Measured by Values ----");
        
        double averageValue = coinData.getAverage();
        System.out.println("Average coin Value = " + averageValue);

        Coin maxCoin = coinData.getMaximum();
        System.out.println("Name of max coin = " + maxCoin.getName());
        System.out.println("Value of max coin = " + maxCoin.getValue());
        
        /* --------------- Coins Measured by Name Length --------------- */
        measureCoin = new CoinNameMeasurer();
        coinData = new DataSet(measureCoin);

        coinData.add(p); // p, q, and d were created above
        coinData.add(q);
        coinData.add(d);
        
        System.out.println("\n---- Coins Measured by Names ----");
        
        double averageNameLength = coinData.getAverage();
        System.out.println("Average coin name length = " + averageNameLength);

        maxCoin = coinData.getMaximum();
        System.out.println("Name of max coin = " + maxCoin.getName());
        System.out.println("Value of max coin = " + maxCoin.getValue());
        
        
        /* --------------- Bank Accounts --------------- */
        Measurer<BankAccount> measureBankAccount = new BankAccountMeasurer();
        DataSet<BankAccount> accountData = new DataSet(measureBankAccount);

        BankAccount b1 = new BankAccount(800);
        BankAccount b2 = new BankAccount(500);
        BankAccount b3 = new BankAccount(200);
        
        accountData.add(b1);
        accountData.add(b2);
        accountData.add(b3);

        System.out.println("\n---- Bank Accounts ----");
        
        double averageBalance = accountData.getAverage();
        System.out.println("Average account balance = " + averageBalance);

        BankAccount maxAccount = accountData.getMaximum();
        System.out.println("From getBalance() method = " + maxAccount.getBalance());
        
    }
}
