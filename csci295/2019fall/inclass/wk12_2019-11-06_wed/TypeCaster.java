/**
 *
 * @author Dr. Lillis
 */
public class TypeCaster {
    public static void main(String[] args) {
        
        SavingsAccount sa = new SavingsAccount(10);
        BankAccount ba = sa;
        
        
        ba.deposit(10000);
        System.out.println("Balance = " + sa.getBalance());
        ba.deposit(999);
        System.out.println("Balance = " + sa.getBalance());
        
        // Make a bank account object
        BankAccount ba1 = new BankAccount(8888);
        System.out.println("Bank Account 1 Balance = " + ba1.getBalance());
        SavingsAccount sa1 = (SavingsAccount)ba1;
        sa1.deposit(22);
        sa1.addInterest();
        
        
    }
}
