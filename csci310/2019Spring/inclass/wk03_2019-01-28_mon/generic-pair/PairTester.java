/**
 *
 * @author Dr. Lillis
 */
public class PairTester {
    public static void main(String[] args) {
        // ---------------------------------------------------------------------
        // Pair of Integers
        System.out.println("---------- Pair of Integers ----------");
        MyPair<Integer> point = new Pair<>(27, 65);
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
        MyPair<String> name = new Pair<>("Ron", "Swanson");
        System.out.println(name);
        System.out.println("first: " + name.getFirst());
        System.out.println("second: " + name.getSecond());
        
        String oldFirst = name.setFirst("Duke");
        String oldSecond = name.setSecond("Silver");
        System.out.println("returned first: " + oldFirst);
        System.out.println("returned second: " + oldSecond);
        
        System.out.println(name);

        
        
    }
}
