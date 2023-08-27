import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int numberToGuess = random.nextInt(100) + 1;
    int guesses = 0;
    int guess = 0;
    boolean correct = false;
    
    System.out.println("Welcome to the Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100...");
    
    while (!correct) {
      System.out.print("Enter your guess: ");
      guess = input.nextInt();
      guesses++;
      
      if (guess == numberToGuess) {
        System.out.println("Congratulations, you guessed the number in " + guesses + " tries!");
        correct = true;
      } else if (guess < numberToGuess) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
    input.close();
  }
}
