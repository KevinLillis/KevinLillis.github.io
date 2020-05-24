/**
 *
 * @author Dr. Lillis
 */
public class CopyingObjectsDemo {
    public static void main(String[] args) {
        // Multiple rerences to MUTABLE object
        // Can't just do this - it's a shallow copy
        BankAccount dadsAccount = new BankAccount(10000);
        BankAccount kidsAccount = dadsAccount; // we didn't really make a copy
        
        System.out.println(dadsAccount);
        System.out.println(kidsAccount);
        
        kidsAccount.withdraw(4000);

        System.out.println();
        System.out.println(dadsAccount);
        System.out.println(kidsAccount);
        
        // This will work
        
        System.out.println("This works\n\n\n");
        BankAccount d = new BankAccount(10000);
        BankAccount k = d.clone(); // we REALLY DO make a copy
        
        System.out.println(d);
        System.out.println(k);
        
        k.withdraw(4000);

        System.out.println();
        System.out.println(d);
        System.out.println(k);
    }
}
