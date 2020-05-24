import java.util.Random;
import java.util.Scanner;

public class Pig {

    public static void main(String[] args) {
        /* 
            Don't change this method - Except for maybe uncommenting the
            line that seeds the random generator to test your program.
        */
        
        Random generator = new Random();
        // Uncomment the next line to reproduce the sample run from the assignment
        //generator.setSeed(2000);
        Scanner keyboard = new Scanner(System.in);

        printWelcome();
        int gameScore = playGame(generator, keyboard);
        String evaluation = evaluateScore(gameScore);

        System.out.println("Your final score is " + gameScore + ".");
        System.out.println("You score is " + evaluation + ".");
    }

    public static String evaluateScore(int score) {
        // TODO: Finish this method
    }

    public static int playGame(Random gen, Scanner input) {
        // TODO: Finish this method
    }

    public static int playTurn(Random gen, Scanner input) {
        // TODO: Finish this method
    }

    public static void printWelcome() {
        // TODO: Finish this method
    }

    public static boolean rollAgain() {
        // TODO: Finish this method
    }

    public static int rollDie(Random gen) {
        // TODO: Finish this method
    }

}
