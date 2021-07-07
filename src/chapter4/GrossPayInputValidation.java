package chapter4;
/*
*WHILE LOOP
* Each store employee makes $15 an hour.  Write a program that allows
* the employee to enter the number of hours worked for the week.
* Do not allow overtime
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String args[]){

        //Initialize known variables
        int payRate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week? ");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input from user--use the 'while' loop
        while(hoursWorked > maxHours || hoursWorked < 1){ //hoursWorked is the Sentinel  || means 'or'
            System.out.println("Invalid entry, Your hours must be between 1 and 40, try again please");
            hoursWorked = scanner.nextDouble(); //this will let them re-enter
        }
        scanner.close();

        //Calculate gross
        double gross = payRate*hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
