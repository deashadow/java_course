package chapter3;

/*
IF ELSE IF statements
 */

import java.util.Scanner;

public class TestResults {

    public static void main(String args []){

        //Get the test score
        System.out.println("Please enter your test score: ");
        Scanner scanner = new Scanner(System.in);
        double testScore = scanner.nextDouble();

        //Determine the letter grade
        char grade;

        if(testScore < 60){
            grade = 'F';
        }
        else if(testScore < 70){
            grade = 'D';
        }
        else if (testScore < 80){
            grade = 'C';
        }
        else if (testScore < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.println("Your test score grade is " + grade);
    }
}
