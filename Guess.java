import java.util.Random;
import java.util.Scanner;

public class Guess{
    public static void main(String[] args) {
        Random random = new Random();

          Scanner scanner = new Scanner(System.in);

        int NoTOGuess = random.nextInt(100) + 1;
           int Tries = 0;

           int guess;
           boolean Correct = false;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it!");

        while (!Correct) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            Tries++;

            if (guess < NoTOGuess) {

                System.out.println("Too low....Try again.");

            } else if (guess > NoTOGuess) {

                System.out.println("Too high.....Try again.");

            }
            else {

                Correct = true;
                System.out.println("Congratulations......You've guessed the number!");
                System.out.println("It took you " + Tries + " tries.");

            }
        }
        scanner.close(); }

}
