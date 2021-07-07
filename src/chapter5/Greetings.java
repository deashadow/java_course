package chapter5;
/*
*OUR FIRST METHOD
* Write a method that asks a user for their name,
*  then greets them by name
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String args[]){ //first method 'main'==always starts there
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);  //must have method in main to be called
    }
    public static void greetUser(String name){  //second method
        System.out.println("Hello there, " + name +
                " !!  Hope you are having a great day!!");
    }
}
