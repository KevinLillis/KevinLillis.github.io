/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount  implements Cloneable {  
   private double balance; 

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount() {  
      this(0);
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance) {  
      balance = initialBalance;
   }
 
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount) {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) {  
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance() {  
      return balance; 
   }
   
   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transfer(double amount, BankAccount other) {  
      withdraw(amount);
      other.deposit(amount);
   }
   
   // Override the equals method of the Object class
   
   @Override
   public boolean equals(Object obj){
       if(obj == null){
           return false;
       }
       
       if(this.getClass() != obj.getClass()){
           return false;
       }
       
       // If we get here without returning, then we KNOW obj is a reference
       // to a BankAccount object.
       
       BankAccount otherAccount = (BankAccount) obj;
       
       // now see if this.balance is the same as otherAccount.balance
       if(Math.abs(this.balance - otherAccount.balance) >= 1E-12 ){
           // the balances are not equal
           return false;
       }
       
       return true;
       
   }
   
   @Override
   public String toString(){
       String s = "";
       
       s += this.getClass().getName(); // The name of this class
       s += "[balance = " + balance + "]";
       
       return s;
   }
   
   @Override
   public BankAccount clone(){
       try{
           // Step 1: Make a shallow using clone from the Object class
           BankAccount cloned = (BankAccount) super.clone();
           
           // Step 2 would be to clone any other instance variables that are
           // not numeric types. In this case, we only have numeric types,
           // so we don't need to do step 2.
           
           return cloned;
       } catch (CloneNotSupportedException ex){
           // We'll never get here because this class implements Cloneable
           return null;
       }
       
   }
   
}
