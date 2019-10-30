
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class FileIO {
    public static void main(String[] args) throws IOException {
        // Read names from a text file and save them to an ArrayList
        
        Scanner inFile = new Scanner(new File("dataFile.txt"));
        
        ArrayList<String> names = new ArrayList<>();
        
        while(inFile.hasNext()){
            String name = inFile.next();
//            System.out.println(name);
            names.add(name);
        }
        
        inFile.close();
        
        System.out.println(names);
        
        // Sort the ArrayList using a Comparator
        
        names.sort(new ReverseStringComp());
        System.out.println(names);
        
        // Write the names to a text file
        String outFileName = "sorted names.txt";
        PrintWriter outFile = new PrintWriter(new File(outFileName));
        
        for(String name : names){
            outFile.println(name);
        }
        
        outFile.close();
    }
}
