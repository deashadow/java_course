package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countwords("I love Test Automation University!!"); //pass this method
        reverseString("Hello TAU!!"); //call method here
    }

    /**
     * Splits a String into an array by tokenizing it.
     * Counts words and prints them
     *
     * @param text Full string to be split
     */
    public static void countwords(String text) {
        var words = text.split(" "); //creates an array
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in Reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){

    }
}