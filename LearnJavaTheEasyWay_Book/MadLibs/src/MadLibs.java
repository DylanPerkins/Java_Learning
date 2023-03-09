import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String playAgain = "";

        do {
            System.out.println("Pick an adjective:");
            String adjective = "";
            adjective = input.next();

            System.out.println("Pick another adjective:");
            String adjective2 = "";
            adjective2 = input.next();

            System.out.println("Pick a type of bird:");
            String typeOfBird = "";
            typeOfBird = input.next();

            System.out.println("Pick a room from a house:");
            String roomInHouse = "";
            roomInHouse = input.next();

            System.out.println("Pick a past tense verb:");
            String pastTenseVerb = "";
            pastTenseVerb = input.next();

            System.out.println("Pick a verb:");
            String verb = "";
            verb = input.next();

            System.out.println("Pick a name of a relative:");
            String relativeName = "";
            relativeName = input.next();

            System.out.println("Pick a noun:");
            String noun = "";
            noun = input.next();

            System.out.println("Pick a type of liquid:");
            String aLiquid = "";
            aLiquid = input.next();

            System.out.println("Pick a verb ending with -ing:");
            String ingVerb = "";
            ingVerb = input.next();

            System.out.println("Pick a part of your body(plural):");
            String partOfBodyPlural = "";
            partOfBodyPlural = input.next();

            System.out.println("Pick a noun(plural):");
            String pluralNoun = "";
            pluralNoun = input.next();

            System.out.println("Pick another verb ending with -ing:");
            String ingVerb2 = "";
            ingVerb2 = input.next();

            System.out.println("Pick another noun:");
            String noun2 = "";
            noun2 = input.next();

            System.out.println("Okay, here is your story:");
            System.out.println("It was a " + adjective + ", cold November day. I woke up to the " + adjective2
                    + " smell of " + typeOfBird + " roasting in the " + roomInHouse + " downstairs. I " + pastTenseVerb
                    + " down the stairs to see if I could help " + verb + " the dinner. My mom said, 'See if "
                    + relativeName + " needs a fresh " + noun + ".' So I carried a tray with glasses full of " + aLiquid
                    + " into the " + ingVerb + " room. When I got there, I couldn't believe my " + partOfBodyPlural
                    + "! There were " + pluralNoun + " " + ingVerb2 + " on the " + noun2 + "!");

            System.out.println("That was really fun! Would you like to play again? (y/n)");
            playAgain = input.next();

        } while (playAgain.equalsIgnoreCase("y")); // End of do-while loop.
        input.close();
    }
}
