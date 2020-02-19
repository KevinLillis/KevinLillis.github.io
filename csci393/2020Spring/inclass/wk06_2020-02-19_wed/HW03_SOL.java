
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Dr. Lillis
 */
public class HW03_SOL {
    public static void main(String[] args) throws FileNotFoundException {
        int[] lengths = {2400, 4800, 7200, 9600, 12000, 14400, 16800, 19200, 
            21600, 24000, 26400, 28800, 31200, 33600, 36000, 38400, 40800, 43200,
            45600, 48000, 50400, 52800, 55200, 57600, 60000, 62400, 64800, 67200,
            69600, 72000, 74400, 76800, 79200, 81600, 84000, 86400, 88800, 91200,
            93600, 96000};
        
        PrintWriter outFile = new PrintWriter(new File("results.csv"));
        
        int[] array;
        long start, stop, elapsed;
        outFile.println("n,Time");
        for(int length : lengths){
            System.out.println("length " + length);
            array = getArray(length);
            
            start = System.nanoTime();
            uniqueElemets(array);
            stop = System.nanoTime();
            
            elapsed = stop - start;
            outFile.println(length + ", " + elapsed);
        }
        
        outFile.close();
        
    }
    
    static boolean uniqueElemets(int[] array){
        for(int i = 0; i < array.length - 2; i++){
            for(int j = i+1; j < array.length; j++){
                if (array[i] == array[j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    static int[] getArray(int length){
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = i;
        }
        return array;
    }

}
