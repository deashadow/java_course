package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]) {
        //1. Get the number of hours worked
        System.out.println("Please enter your total hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt ();

        //2. Get the hourly pay rate
        System.out.println("Please enter your hourly pay rate: ");
        double hourlyRate = scanner.nextDouble ();
        scanner.close();


        //3. Multiply hours and pay rate
        double grossPay = hours * hourlyRate;

        //4. Display result
        System.out.println(("Your gross pay is: $" + grossPay));
    }
}
