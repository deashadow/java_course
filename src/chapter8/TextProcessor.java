package chapter8;

public class TextProcessor {

    public static void main(String[] args) {
        countwords("I love Test Automation University!!"); //pass this method
        reverseString("Hello TAU!!"); //call method here
        addSpaces("   HeyWorld!!It'sMeRonaldWhat'sShaking??"); //call method here
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
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Adds spaces before each uppercase letter
     * @params text jumbled text
     */
    public static void addSpaces(String text){
         var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase((modifiedText.charAt(i)))){
                modifiedText.insert(i, " "); //will insert a space if Capital letter
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}