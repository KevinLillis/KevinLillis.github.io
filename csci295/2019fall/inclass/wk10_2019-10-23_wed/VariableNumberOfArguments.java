/**
 *
 * @author Dr. Lillis
 */
public class VariableNumberOfArguments {
    
    public static void main(String[] args) {
        System.out.println(max());
        System.out.println(max(99));
        System.out.println(max(2, 5));
        System.out.println(max(4, 7, 3));
        System.out.println(max(2, 3, 4, 3, 2, 3, 4, 56, 76, 4 ));
    }
    
    public static int max(int... values){
        if(values.length == 0){
            System.out.println("ERROR");
            return Integer.MIN_VALUE;
        }
        int largest = values[0];
        
        for(int number : values){
            if (number > largest){
                largest = number;
            }
        }
        
        return largest;
    }

}
