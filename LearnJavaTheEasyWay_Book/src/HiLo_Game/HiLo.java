package HiLo_Game;

import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);      

        // Create a random number for the user to guess
        int theNumber = (int)(Math.random() * 100 + 1);

        int userGuess;

        // Asks user to make their input
        System.out.println("Guess a number between 1 and 100:");
        userGuess = scan.nextInt();
    }
}
