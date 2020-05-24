/**
 *
 * @author Dr. Lillis
 */
public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("You entered " + args.length + " command line arguments");
        System.out.println("They are:");
        
        for(String arg : args){
            System.out.println(arg);
        }
        
    }

}
