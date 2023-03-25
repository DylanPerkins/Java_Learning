package Chapter_3_Strings_and_Things;

public class SubStrings {
    public static void main(String[] args) {
        String testString = "Java is great.";
        System.out.println(testString);
        // Output: Java is great.

        String b = testString.substring(5); 
        System.out.println(b);
        // Output: is great.

        String c = testString.substring(5, 7);
        System.out.println(c);
        // Output: is
        
        String d = testString.substring(5,testString.length());
        System.out.println(d);
        // Output: is great.
    }
}
