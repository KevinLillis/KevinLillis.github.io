/**
 *
 * @author Dr. Lillis
 */public class MeasurerDataSetTester {
    public static void main(String[] args) {
        Object max; // Used to get the maximum object from each DataSet.
        
        /* --------------- Strings --------------- */
        // Make the measurer and data set
        Measurer measureString = new StringMeasurer();
        DataSet stringData = new DataSet(measureString);
        
        // Add strings to the data set
        stringData.add("Hello World");
        stringData.add("What time is it Mr. Fox");
        stringData.add("To boldly go where no man has gone before");
        stringData.add("May the Force be with you");

        // Display some results
        System.out.println("---- Strings ----");
        
        double averageLength = stringData.getAverage();
        System.out.println("Average String Length = " + averageLength);

        max = stringData.getMaximum(); // max is a reference of type Object  
        
         // Use Object reference and toString method
        System.out.println("Max String = " + max);
        
        // Use a String reference to access String class's length() method
        String maxString = (String)max;
        System.out.println("Length of max string = " + maxString.length());

        /* --------------- Coins Measured by Values --------------- */
        Measurer measureCoin = new CoinValueMeasurer();
        DataSet coinData; // We'll use this variable for two examples
        
        coinData = new DataSet(measureCoin);

        Coin p = new Coin(.01, "Wheat-Back Penny");
        Coin d = new Coin(.1, "Dime");
        Coin q = new Coin(.25, "Quarter");

        coinData.add(p);
        coinData.add(q);
        coinData.add(d);
        
        System.out.println("\n---- Coins Measured by Values ----");
        
        double averageValue = coinData.getAverage();
        System.out.println("Average coin Value = " + averageValue);

        max = coinData.getMaximum(); //max is a reference of type Object
        
        // Use Object reference and toString method
        System.out.println("Max coin = " + max);
        
        // Use Coin reference to access Coin methods
        Coin maxCoin = (Coin)max;
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

        max = coinData.getMaximum(); //max is a reference of type Object
        
        // Use Object reference and toString method
        System.out.println("Max coin = " + max);
        
        // Use Coin reference to access Coin methods
        maxCoin = (Coin)max; // maxCoin is a refrence of type Coin
        
        System.out.println("Name of max coin = " + maxCoin.getName());
        System.out.println("Value of max coin = " + maxCoin.getValue());
        
        
        /* --------------- Bank Accounts --------------- */
        Measurer measureBankAccount = new BankAccountMeasurer();
        DataSet accountData = new DataSet(measureBankAccount);

        BankAccount b1 = new BankAccount(800);
        BankAccount b2 = new BankAccount(500);
        BankAccount b3 = new BankAccount(200);
        
        accountData.add(b1);
        accountData.add(b2);
        accountData.add(b3);

        System.out.println("\n---- Bank Accounts ----");
        
        double averageBalance = accountData.getAverage();
        System.out.println("Average account balance = " + averageBalance);

        max = accountData.getMaximum(); // max is a reference of type Object  
        
         // Use Object reference and toString method
        System.out.println("Max bank account = " + max);
        
        // Use BankAccount reference to access BankAccount's getBalance method
        BankAccount maxAccount = (BankAccount)max;
        System.out.println("From getBalance() method = " + maxAccount.getBalance());
        
    }
}
