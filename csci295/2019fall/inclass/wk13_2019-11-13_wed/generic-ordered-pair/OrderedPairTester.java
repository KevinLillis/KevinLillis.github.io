/**
 *
 * @author Dr. Lillis
 */
public class OrderedPairTester {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
        // OrderedPair of Integers
        System.out.println("---------- (String, Integer) Pairs ----------");
        MyOrderedPair<String, Integer> person = new OrderedPair("Elaine", 65);
        System.out.println(person);
        System.out.println("first: " + person.getFirst());
        System.out.println("second: " + person.getSecond());
        
        String name = person.setFirst("Jack");
        Integer age = person.setSecond(59);
        System.out.println("returned name: " + name);
        System.out.println("returned age: " + age);
        
        System.out.println(person);

        // ---------------------------------------------------------------------
        // OrderedPair of Strings
        System.out.println("\n---------- (Coin, BankAccount) pairs ----------");
        Coin q = new Coin(.25, "Quarter");
        BankAccount account = new BankAccount(1000);
        
        MyOrderedPair<Coin, BankAccount> op = new OrderedPair(q, account);
        System.out.println(op);
        System.out.println("first: " + op.getFirst());
        System.out.println("second: " + op.getSecond());
        
        Coin oldCoin = op.setFirst(new Coin(.1, "Dime"));
        BankAccount oldAccount = op.setSecond(new BankAccount(50));
        
        System.out.println("returned first: " + oldCoin);
        System.out.println("returned second: " + oldAccount);
        
        System.out.println(op);

        
        
    }
}
