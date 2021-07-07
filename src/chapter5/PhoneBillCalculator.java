package chapter5;

import java.util.Scanner;
/*So, what you're going to do is allow the user to input
 the plan fee and the number of overage minutes. And
 then you're going to charge 25 cents for every minute
  that they've gone over, and then a 15% tax on the subtotal.

I want you to create separate methods to calculate the:
 tax, to calculate the overage fees, and to calculate
 and print the final total.

Please print this as an itemized bill
*EXAMPLE OUTPUT
Enter base cost of the plan:
82.45
Enter overage minutes:
9
Phone Bill Statement
Plan: $82.45
Overage: $2.25
Tax: $12.71
Total: $97.41
 */
public class PhoneBillCalculator {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);  //make it global
            //ask for data you want
        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageCharge = calculateOverages(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateAndPrintBill(baseCost, overageCharge, tax);
    }

    public static double calculateOverages(double extraMinutes){
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;
    }

    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }

    public static void calculateAndPrintBill(double base, double overage, double tax){
        double finalTotal = base + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", overage));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));
    }
}
