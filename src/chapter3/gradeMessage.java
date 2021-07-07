package chapter3;

import java.util.Scanner;

public class gradeMessage {

    public static void main(String args []){
        System.out.println("Please enter your letter grade: "); //make a variable for grade
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;

        switch (grade){
            case "A":
                message = "Excellent job!!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Fair work,,,";
                break;
            case "D":
                message = "Below Expectations!";
                break;
            case "F":
                message = "Poor Job!!!  You need a lot more practice";
                break;
            default:
                message = "Error, invalid grade entry, please try again. ";
        }
        System.out.println(message);
    }
}
