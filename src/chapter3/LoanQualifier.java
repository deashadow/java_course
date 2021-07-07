package chapter3;

/*
 *NESTED IF's
 * To qualify for a loan, a person must make at least $30,000.
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args []){

        //Initialize what we know---establish variables first!!
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //Get what we do not know
        System.out.println("Please enter your current annual salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Please enter the number of years at your current job: ");
        double yearsAtJob = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary){
            if(yearsAtJob >= requiredYearsEmployed){
                System.out.println("Congrats!!  You qualify for the loan.");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry!!  you must earn at least $"
                    + requiredSalary + " to qualify for the loan...Try again.");
        }
    }
}
