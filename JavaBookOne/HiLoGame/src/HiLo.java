import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String playAgain = "";

        do {
            // Create a random number for the user to guess and initilize a variable to hold their guess.
            int theNumber = (int) (Math.random() * 100 + 1);
            int userGuess = 0;
            int numberOfTries = 0;

            while (userGuess != theNumber) {
                // Asks user to make their input, then stores that input in userGuess.
                System.out.println("Guess a number between 1 and 100:");
                userGuess = scan.nextInt();

                if (userGuess < theNumber) {
                    ++numberOfTries;
                    System.out.println(userGuess + " is too low. Please try again!");
                } else if (userGuess > theNumber) {
                    ++numberOfTries;
                    System.out.println(userGuess + " is too high. Please try again!");
                } else if (userGuess == theNumber) {
                    System.out.println(userGuess + " was correct! Nice job!");
                    System.out.println("This took you " + numberOfTries + " tries!");
                } else {
                    ++numberOfTries;
                    System.out.println("Silly goose, this input is invalid!");
                }
            } // End of guessing loop.

            System.out.println("Would you like to play again? (y/n)");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y")); // End of do-while loop.

        System.out.println("Thank you for playing my game! Byee!");
        scan.close(); // Closes the scanner system, preventing resource leaks.
    }
}
