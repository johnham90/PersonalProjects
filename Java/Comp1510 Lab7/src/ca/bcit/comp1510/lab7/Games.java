/**
 * 
 */
package ca.bcit.comp1510.lab7;

import java.util.Random;
import java.util.Scanner;

/**
 * Games represents a set of games, with a basic menu to check current score,
 * play one of two games, or quit. Methods inside the class include a number
 * guessing game and rock paper scissors.
 * @author John Ham
 * @version 2018.03.05
 */
public class Games {
    /**
     * Constant for points to add.
     */
    private static final int ADD5 = 5;
    /**
     * Constant for points to subtract.
     */
    private static final int SUB3 = 3;
    /**
     * Variable to store the value of the score.
     */
    private int score;
    /**
     * Scanner object.
     */
    private Scanner scan;
    /**
     * Random object.
     */
    private Random random;
    
    /**
     * Constructs a Games object.
     */
    public Games() {
        score = 0;
        scan = new Scanner(System.in);
        random = new Random();
    }
    
    /**
     * Allows the user to choose between displaying current score, playing
     * the guess a number game, playing rock paper scissors, or quitting.
     * The user is prompted for a choice until quitting.
     */
    public void play() {
        // should I add local variable for 1 & 2?
        final int choice3 = 3;
        final int choice4 = 4;
        int choice;
    
        System.out.print("Welcome to the Games program!\nMake your choice"
                + " (enter a number):\n1. See your score\n2. Guess a number"
                + "\n3. Play Rock, Paper, Scissors\n4. Quit\n> ");
        choice = scan.nextInt();
        
        switch (choice) {
        case 1 :
            System.out.println("Your score is : " + score);
            System.out.println();
            play();
            break;
        case 2 :
            guessANumber();
            play();
            break;
        case choice3 :
            rockPaperScissors();
            play();
            break;
        case choice4 :
            break;
        default :
        }
    }
    
    /**
     * Plays the guess a number game. A random number between 0 and 100
     * inclusive is generated and the user is prompted to guess the generated
     * number up to 5 times. The use is informed whether they guessed too high
     * or too low. A correct guess adds 5 to the score.
     */
    public void guessANumber() {
        final int guesses = 4;
        final int num = random.nextInt(101);
        
        System.out.println("I've picked a number between 0 and 100\nCan you "
                + "guess it?\nGuess the number!");
        int guess = scan.nextInt();
        
        // should I use i for variable name?
        for (int i = 0; i < guesses; i++) {
            if (guess == num) {
                System.out.println("RIGHT!\nFive points!");
                score += ADD5;
                return;
            } else if (guess < num) {
                System.out.println("Too low, guess again!");
            } else {
                System.out.println("Too high, guess again!");
            }
            
            guess = scan.nextInt();
        }
        if (guess == num) {
            System.out.println("RIGHT!\nFive points!");
        } else {
            System.out.println("Wrong! You're out of guesses!");
        }
        System.out.println();
    }
    
    /**
     * Plays rock paper scissors. A random number between 0 and 2 is generated,
     * with 0 as rock, 1 as paper, and 2 as scissors. Winning the game adds 5
     * to the score and losing subtracts 3 from the score.
     */
    public void rockPaperScissors() {
        // generates a random number between 0 and 2 inclusive where 
        // 0 = rock, 1 = paper, 2 = scissors.
        final int rps = random.nextInt(3);
        
        System.out.println("I've picked one of ROCK, PAPER, SCISSORS"
                + "\nWhich one do you choose?");
        String choice = scan.next().toUpperCase().trim();

        while (!choice.equals("ROCK") && !choice.equals("PAPER") 
                && !choice.equals("SCISSORS")) {
            System.out.println("That's not a valid choice! Try again!");
            choice = scan.next().toUpperCase().trim();
        }
        
        switch (choice) {
        case "ROCK" :
            switch (rps) {
            case 0 :
                System.out.println("Tie! Rock ties with rock!");
                // is using return okay?
                break;
            case 1 :
                System.out.println("You lose! Paper wraps rock!");
                score -= SUB3;
                break;
            case 2 :
                System.out.println("You win! Rock smashes scissors!");
                score += ADD5;
                break;
            default :
                break;
            }
            break;
        case "PAPER" :
            switch (rps) {
            case 0 :
                System.out.println("You win! Paper wraps rock!");
                score += ADD5;
                break;
            case 1 :
                System.out.println("Tie! Paper ties with paper!");
                break;
            case 2 :
                System.out.println("You lose! Scissors cut paper!");
                score -= SUB3;
                break;
            default :
                break;
            }
            break;
        case "SCISSORS" :
            switch (rps) {
            case 0 :
                System.out.println("You lose! Rock smashes scissors!");
                score -= SUB3;
                break;
            case 1 :
                System.out.println("You win! Scissors cut paper!");
                score += ADD5;
                break;
            case 2 :
                System.out.println("Tie! Scissors ties with scissors!");
                break;
            default : 
                break;
            }
            break;
        default :
            System.out.println("That's not a valid choice! Try again!");
        }
        System.out.println();
    }
}
