/**
 *
 * @author Dr. Lillis
 */
public class SimpleTester {
    public static void main(String[] args) {
        String[] items = {"A", "B", "C", "D", "E", "F", "G"};
        ListOfStrings list = new ListOfStrings();
        
        for(String item : items){
            list.add(item);
        }
        
        System.out.println(list);
        
        list.addFirst("First");
        list.addLast("Last");
        list.add(list.size()/2, "Middle");
        
        System.out.println(list);
        
        System.out.println(list.getFirst() + " " + list.getLast());

        
    }
}
