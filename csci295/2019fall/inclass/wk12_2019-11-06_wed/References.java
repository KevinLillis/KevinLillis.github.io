/**
 *
 * @author Dr. Lillis
 */
public class References {
    public static void main(String[] args) {
        Object ob;
        BankAccount ba;
        SavingsAccount sa;
        CheckingAccount ca;
        
        ca = new CheckingAccount(10);
        ba = new CheckingAccount(10);
        ob = new CheckingAccount(10);
    }
}
