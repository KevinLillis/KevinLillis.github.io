// Note: This is done only using while loops

import java.util.Random;
import java.util.Scanner;

public class Pig {

    public static void main(String[] args) {
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

        if (score <= 30) {
            return "poor";
        } else if (score <= 50) {
            return "average";
        } else {
            return "excellent";
        }

    }

    public static int playGame(Random gen, Scanner input) {
        int totalScore = 0;
        int turnScore;
        int turn = 1;
        while (turn <= 5) {
            System.out.println("Turn " + turn);
            turnScore = playTurn(gen, input);
            totalScore += turnScore;

            System.out.println("   Your score for this turn is " + turnScore);
            System.out.println("   Your total score is " + totalScore);
            System.out.println();

            turn++;
        }

        System.out.println("That's the end of the game.");
        return totalScore;

    }

    public static int playTurn(Random gen, Scanner input) {
        int turnScore = 0;
        int roll;

        boolean turnOver = false;
        while (!turnOver) {
            roll = rollDie(gen);
            System.out.println("   The roll is " + roll);
            if (roll == 1) {
                turnScore = 0;
                turnOver = true;
            } else {
                turnScore += roll;
                if (!rollAgain()) {
                    turnOver = true;
                }
            }
        }

        return turnScore;
    }

    public static void printWelcome() {
        String s = "";

        s += "--== Welcome to the Game of Pig ==--\n";
        s += "\n";
        s += "You get five turns to accumulate points by rolling a six-sided die.\n";
        s += "In each turn, you may roll the die as many times as you want,\n";
        s += "with the values of the rolls added to your score.\n";
        s += "If, however, you roll a one, the score for that turn is zero.\n";
        s += "\n";
        s += "At the end of the game, I will evaluate your score as follows:\n";
        s += "        Below 30  Poor\n";
        s += "        31 to 50  Average\n";
        s += "        Above 50  Excellent\n";
        s += "\n";
        s += "Good luck.\n";

        System.out.println(s);

    }

    public static boolean rollAgain() {
        Scanner in = new Scanner(System.in);
        System.out.print("   Roll again? ");
        String rollAgain = in.next();

        return rollAgain.equalsIgnoreCase("y");
    }

    public static int rollDie(Random gen) {
        return gen.nextInt(6) + 1;
    }

}
