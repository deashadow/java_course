package chapter5;

import java.util.Scanner;
/*
*VARIABLE SCOPE
* Write an 'Instant credit check' program that approves anyone
* who makes more than $25K and has a credit score of 700 or
* better....   Reject all others!!
 */
public class InstantCreditCheck {
//declare at the class level, then can be used everywhere
    static int requiredSalary = 25000; //initialize known variables
    static int requiredCreditScore = 700; //must declare static since methods are static
    static Scanner scanner = new Scanner(System.in); //make global

    public static void main(String args[]){
        //Initialize what we know

        //Get what we do not know
        double salary = getSalary();  //must make the call to run method
        int creditScore = getCreditScore();
        scanner.close();  //let main method close scanner
        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }
    public static double getSalary(){
        System.out.println("Please enter your current salary: ");

        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Please enter you Credit Score: ");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary) {
        if (creditScore >= requiredCreditScore && salary >= requiredSalary) {
            return true;
        } else {
            return false;
        }
    }
        public static void notifyUser(boolean isQualified){
            if(isQualified){
                System.out.println("Congrat's! You have been approved");
            }
            else{
                System.out.println("Sorry!! You have been declined..");
        }
    }
}
