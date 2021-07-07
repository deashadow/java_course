package chapter3;

/*
* IF ELSE
* All salespeople are expected to make at least 10 sales each week.
* For those who do, they will receive a congratulatory message!!
* For those who do not, they will be informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String args[]) {

        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Please enter the number of sales that you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take--->> Output
        if (sales >= quota) {
            System.out.println("Congrats!!  Really good work you met your quota..");
        }
        else{
            int salesShort = quota- sales;
            System.out.println("You did not make your quota goal...  You were "  + salesShort + " sales short---sorry...  Better luck next week!!");
        }
    }
}
