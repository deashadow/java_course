package chapter7;

import java.util.Scanner;

/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 * You just create methods for each particular task that is being asked!!
 */
public class Grades {

    private static int grades[]; //assign the array for starters
    private static Scanner scanner = new Scanner(System.in); //make global

    public static void main(String[] args){

        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades(); //declare methods in main Method 1
                                            //%.2f placeholder for float for 2 decimal places
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        System.out.println("Lowest: " + getLowest());

    }

    public static void getGrades(){
        for(int i=0; i<grades.length; i++){ //use traditional for loop for an empty array
            System.out.println("Enter grade #" + (i+1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum(){  //Method 2
        int sum = 0;
        for(int grade : grades){ //use enhanced loop because we have a fixed number now
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage(){ //Method 3
        return calculateSum()/grades.length;
    }

    public static int getHighest(){ //This is a popular algorithm!!!
        int highest = grades[0];
        for(int grade: grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){ //This is a popular algorithm!!!
        int lowest = grades[0];
        for(int grade: grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }

}
