import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
    // Generate a random number between 1 and 100 (inclusive)
    int numberToGuess = random.nextInt(100) + 1;
    
    int guesses = 0;
    int guess = 0;
    boolean correct = false;
    
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100...");
    
    // Main game loop
    while (!correct) {
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
      guesses++;
      
      // Check if the guess matches the randomly generated number
      if (guess == numberToGuess) {
        System.out.println("Congratulations, you guessed the number in " + guesses + " tries!");
        correct = true; // Set flag to exit the loop
      } else if (guess < numberToGuess) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
    
    // Close the Scanner
    input.close();
  }
}
