
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dr. Lillis
 */
public class TripleDemo {

    public static void main(String[] args) {
        ArrayList<Triple<String, Integer, Coin>> stringList = new ArrayList<>();
        stringList.add(new Triple<>("C", 1, new Coin(1, "Penny")));
        stringList.add(new Triple<>("C", 2, new Coin(10, "Dime")));
        stringList.add(new Triple<>("A", 7, new Coin(5, "Nickel")));
        stringList.add(new Triple<>("A", 1, new Coin(25, "Quarter")));
        stringList.add(new Triple<>("B", 1, new Coin(50, "Half")));
        stringList.add(new Triple<>("B", 1, new Coin(10, "Dime")));
        stringList.add(new Triple<>("A", 9, new Coin(1, "Penny")));
        stringList.add(new Triple<>("A", 2, new Coin(10, "Dime")));
        stringList.add(new Triple<>("C", 4, new Coin(1, "Penny")));
        stringList.add(new Triple<>("A", 2, new Coin(5, "Nickel")));
        stringList.add(new Triple<>("A", 1, new Coin(25, "Quarter")));
        stringList.add(new Triple<>("C", 4, new Coin(50, "Half")));
        stringList.add(new Triple<>("B", 1, new Coin(10, "Dime")));
        
        print(stringList);
        Collections.sort(stringList);
        print(stringList);
        
        
    }
    
    static void print(ArrayList list){
        System.out.println("------------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
