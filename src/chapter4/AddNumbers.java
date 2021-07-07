package chapter4;
/*
* DO WHILE LOOP
* Write a program that allows the user to enter 2 numbers,
* and then sums up the 2 numbers.  The user should be able to repeat
* this action until they indicate they are done
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String args[]){

        //Prompt user to enter first number then second
        Scanner scanner = new Scanner(System.in);
        boolean playAgain; //this is the Sentinel
        do{
            System.out.println("Please enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Please enter your second number: ");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;

            System.out.println("The sum of your 2 numbers is " + sum);

            System.out.println("Would you like to play again? Enter either True or False");
            playAgain = scanner.nextBoolean();

        } while(playAgain); //Sentinel ends the loop

        scanner.close();
    }
}
