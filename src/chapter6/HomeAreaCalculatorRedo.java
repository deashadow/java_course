package chapter6;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in); //make global

    public static void main(String args[]) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();//this is a constructor
        Rectangle kitchen = calculator.getroom();
        Rectangle bathroom = calculator.getroom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area of both your rooms is: " + area);

        calculator.scanner.close();
    }

    public Rectangle getroom() {


        System.out.println("Enter the length of your rooms: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your rooms: ");
        double width = scanner.nextDouble();


        return new Rectangle(length, width);

    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
