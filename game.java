import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = number.nextInt(100) + 1;
            int attempts = 0;
            int maxattempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100. You have " + maxattempts + " attempts.");

            while (attempts < maxattempts) {
                System.out.print("Enter your guess: ");
                int guess = input.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all attempts. The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = input.next();
            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Game over! Your total score (rounds won): " + score);
        input.close();
    }
}
