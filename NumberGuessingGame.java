import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        guessTheNumber();
    }

    static void guessTheNumber() {
        // Step 1: Generate a random number within the specified range
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        // Initialize variables
        int attempts = 0;
        int maxAttempts = 10;
        int roundsWon = 0;

        // Step 4: Repeat until the user guesses the correct number or runs out of attempts
        while (attempts < maxAttempts) {
            // Step 2: Prompt the user to enter their guess
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess the number (between 1 and 100): ");
            int userGuess = scanner.nextInt();

            // Step 3: Compare the user's guess with the generated number and provide feedback
            if (userGuess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number (" + secretNumber + ") in "
                        + (attempts + 1) + " attempts.");
                roundsWon++;
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            // Increment the attempts
            attempts++;
        }

        // Check if the user ran out of attempts
        if (attempts == maxAttempts) {
            System.out.println("Sorry, you ran out of attempts. The correct number was " + secretNumber + ".");
        }

        // Display the user's score
        System.out.println("Rounds won: " + roundsWon);
    }
}
