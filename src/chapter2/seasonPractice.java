package chapter2;

import java.util.Scanner;

public class seasonPractice {

    public static void main(String arg[]) {
        //1. Get your favorite Season
        System.out.println("Please enter your favorite Season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next ();

        //2. Get a whole number between 0-10
        System.out.println("Please enter a whole number between 0-10: ");
        double randomNumber = scanner.nextDouble ();


        System.out.println("Please enter an Adjective that describes your favorite Season");
        String adjective = scanner.next();
        scanner.close();


        //4. Display result
        System.out.println(("On a " + adjective  + " " + season +
                " day, I drink a minimum of " + randomNumber +
                " cups of coffee!!"));
    }
}

