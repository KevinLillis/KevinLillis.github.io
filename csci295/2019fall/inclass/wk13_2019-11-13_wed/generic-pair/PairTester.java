/**
 *
 * @author Dr. Lillis
 */
public class PairTester {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
        // Pair of Integers
        System.out.println("---------- Pair of Integers ----------");
        MyPair<Integer> point = new Pair(27, 65);
        System.out.println(point);
        System.out.println("first: " + point.getFirst());
        System.out.println("second: " + point.getSecond());
        
        Integer x = point.setFirst(255);
        Integer y = point.setSecond(912);
        System.out.println("returned first: " + x);
        System.out.println("returned second: " + y);
        
        System.out.println(point);

        // ---------------------------------------------------------------------
        // Pair of Strings
        System.out.println("\n---------- Pair of Strings ----------");
        MyPair<String> name = new Pair("Ron", "Swanson");
        System.out.println(name);
        System.out.println("first: " + name.getFirst());
        System.out.println("second: " + name.getSecond());
        
        String oldFirst = name.setFirst("Duke");
        String oldSecond = name.setSecond("Silver");
        System.out.println("returned first: " + oldFirst);
        System.out.println("returned second: " + oldSecond);
        
        System.out.println(name);

        
        // ---------------------------------------------------------------------
        // Pair of Coins
        System.out.println("\n---------- Pair of Coins ----------");
        Coin p = new Coin(.01, "Penny");
        Coin n = new Coin(.05, "Nikel");
        Coin d = new Coin(.10, "Dime");
        Coin q = new Coin(.25, "Quarter");
        
        MyPair<Coin> twoCoins = new Pair(p, n);
        System.out.println(twoCoins);
        System.out.println("first: " + name.getFirst());
        System.out.println("second: " + name.getSecond());
        
        Coin firstCoin = twoCoins.setFirst(d);
        Coin secondCoin = twoCoins.setSecond(q);
        System.out.println("Old first: " + firstCoin);
        System.out.println("Old second: " + secondCoin);
        
        System.out.println(name);
        
    }
}
