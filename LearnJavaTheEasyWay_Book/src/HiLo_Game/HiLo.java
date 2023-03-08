package HiLo_Game;

import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      

        // Create a random number for the user to guess
        int theNumber = (int)(Math.random() * 100 + 1);
        int userGuess = 0;

        
        while (userGuess != theNumber) {
        // Asks user to make their input
            System.out.println("Guess a number between 1 and 100:");
            userGuess = scan.nextInt();

            if (userGuess < theNumber) {
                System.out.println(userGuess + " is too low. Please try again!");
            } else if (userGuess > theNumber) {
                System.out.println(userGuess + " is too high. Please try again!");
            } else if (userGuess == theNumber) {
                System.out.println(userGuess + " was correct! Nice job!");
            } else {
                System.out.println("Silly goose, this number is invalid!");
            }
        }
    }
}
