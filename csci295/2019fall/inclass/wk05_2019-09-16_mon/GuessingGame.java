
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dr. Lillis
 */
public class GuessingGame {

    public static void main(String[] args) {
        // Declare variables
        Scanner input = new Scanner(System.in);
        Random gen = new Random();

        int guess; // What the user guesses
        int guessCount = 0;
        int secreteNumber = gen.nextInt(100) + 1; //random number from 1 to 100

        // We're going to cheat and show the secrete number
        System.out.println("The secrete number is " + secreteNumber);
        boolean gameOver = false;
        final int MAX_TURNS = 3;

        // Display a start message
        System.out.println("I'm thinking of a number from 1 to 100");
        System.out.println("Can you guess the number?");

        while (!gameOver) {
            guess = getGuess();
            guessCount++;

            if (guess == secreteNumber) {
                System.out.println("Good. You got it in " + guessCount + " guesses");
                gameOver = true;
            } else if (guess < secreteNumber) {
                if (guessCount == MAX_TURNS) {
                    System.out.println("Game over. You didn't guess the number.");
                    System.out.println("The nunber was " + secreteNumber);
                    gameOver = true;
                } else {
                    System.out.println("Too low - Try again");
                }
            } else {
                if (guessCount == MAX_TURNS) {
                    System.out.println("Game over. You didn't guess the number.");
                    System.out.println("The nunber was " + secreteNumber);
                    gameOver = true;
                } else {
                    System.out.println("Too high - Try again");
                }
            }
        }

    }
    
    public static int getGuess(){
        boolean validGuess = false;
        int guess = 0;
        Scanner input = new Scanner(System.in);
        while(!validGuess){
            System.out.print("Enter guess from 1 to 100: ");
            guess = input.nextInt();
            validGuess = 1 <= guess && guess <= 100;
        }
        
        return guess;
    }
}
