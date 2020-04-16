
import java.util.ArrayList;
import java.util.Arrays;

public class HeapTester {

    public static void main(String[] args) {
        stringTest();
        integerTest1();
        integerTest2();
    }

    /**
     * Uses a heap of String Objects and StringComparator. Prints out the
     * strings in order by decreasing length. Strings of the same length are in
     * reverse lexicographical order.
     */
    public static void stringTest() {
        StringComparator StringComp = new StringComparator();
        
        Heap<String> heap = new Heap<>(StringComp);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Jack Harkness",
                "The Doctor",
                "Martha Jones",
                "Mickey Smith",
                "Donna Noble",
                "Rose Tyler",
                "Sally Sparrow",
                "River Song",
                "Sarah Jane Smith",
                "Amy Pond"
        ));

        for (String s : list) {
            heap.add(s);
        }

        System.out.println("----- String Test -----");
        while (!heap.isEmpty()) {
            System.out.println(heap.remove());
        }
    }

    /**
     * Uses a heap of Integer Objects and IntegerComparator1. Prints out the
     * Integers in the following order. 1) All evens come before all odds 2) The
     * evens are sorted from smallest to largest 3) The odds are sorted smallest
     * to largest
     */
    private static void integerTest1() {
        IntegerComparator1 IntegerComp = new IntegerComparator1();
        Heap<Integer> heap = new Heap<>(IntegerComp);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                12, 5, 43, 54, 23, 43, 12, 65, 76, 45, 34, 54, 23, 43, 54
        ));

        for (Integer x : list) {
            heap.add(x);
        }

        System.out.println("\n----- Integer Test 1 -----");
        while (!heap.isEmpty()) {
            System.out.println(heap.remove());
        }

    }

    /**
     * Uses a heap of Integer Objects and IntegerComparator2. Prints out the
     * Integers in the following order. 1) All odds come before all evens 2) The
     * odds are sorted from smallest to largest 3) The evens are sorted smallest
     * to largest
     */
    private static void integerTest2() {
        IntegerComparator2 IntegerComp = new IntegerComparator2();
        Heap<Integer> heap = new Heap<>(IntegerComp);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                12, 5, 43, 54, 23, 43, 12, 65, 76, 45, 34, 54, 23, 43, 54
        ));

        for (Integer x : list) {
            heap.add(x);
        }

        System.out.println("\n----- Integer 2 -----");
        while (!heap.isEmpty()) {
            System.out.println(heap.remove());
        }

    }

}
