package chapter4;
/*
*LOOP BREAK
* Search a String to determine if it contains the letter 'A'
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String args[]) {

        //Get text
        System.out.println("Enter some text: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search text for the letter 'A'
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound= true;
                break;
            }
        }
        if(letterFound){
            System.out.println("The text you entered contained the letter 'A':  Program exited");
        }
        else{
            System.out.println("The text you entered does not contained the letter 'A'");
        }
    }
}