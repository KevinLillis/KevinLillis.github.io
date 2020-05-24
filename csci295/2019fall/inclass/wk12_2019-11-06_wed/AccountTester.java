/**
   This program tests the BankAccount class and its subclasses. 
*/
public class AccountTester {  
   public static void main(String[] args) {  
      SavingsAccount sa = new SavingsAccount(0.5);
      
      CheckingAccount ca = new CheckingAccount(100);
         
      sa.deposit(10000);
      
      sa.transfer(2000, ca);     
      ca.withdraw(1500);
      ca.withdraw(80);      

      sa.transfer(1000, ca);
      ca.withdraw(400);      

      // Simulate end of month
      sa.addInterest();
      ca.deductFees();
      
      System.out.println("sa: " + sa.getBalance());
      System.out.println("Expected: 7035");

      System.out.println("ca: "
            + ca.getBalance());
      System.out.println("Expected: 1116");
   }
}
