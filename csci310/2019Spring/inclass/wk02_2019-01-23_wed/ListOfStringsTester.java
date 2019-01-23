/**
 *
 * @author Dr. Lillis
 */
public class ListOfStringsTester {
    public static void main(String[] args) {
        ListOfStrings L = new ListOfStrings();
        System.out.println("Size = " + L.size());
        System.out.println("Capacity = " + L.getCapacity());
        System.out.println(L);
        
        L.add("A");
        L.add("B");
        L.add("C");
        L.add("D");
        System.out.println(L);
        
        L.add("E");
        System.out.println(L);
    }
}
