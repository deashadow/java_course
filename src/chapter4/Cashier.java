package chapter4;
/*
* FOR LOOP
* Write a cashier program that will scan a given number
* of items and tally the total cost
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String args[]){

        //Get the number of items to scan
        System.out.println("Please enter the number of items you" +
                " would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int totalItems = scanner.nextInt();


        double total = 0;

        //Create loop to iterate through all of the items and
        //accumulate the cost
        for(int i=0; i<totalItems; i++){

          System.out.println("Enter the cost of the item: ");
          double price = scanner.nextDouble();

          total = total + price; //called an accumulator

        }
        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
