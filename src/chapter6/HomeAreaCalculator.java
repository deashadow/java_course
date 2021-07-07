package chapter6;
/*
* Write a class that creates instances of the Rectangle class to
* find the total area of 2 rooms in a house
 */
public class HomeAreaCalculator {

    public static void main(String args[]){ //need to create instances of the Rectangle class

        /*************
         * RECTANGLE 1
         ************/
        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle(); //calling default parameter line 10
        room1.setWidth(25); //accessed from getter
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();
        System.out.println("Area of room 1 is: " + areaOfRoom1);

        /*************
         * RECTANGLE 2
         ************/
        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(30, 75); //using constructor on line 15
        double areaOfRoom2 = room2.calculateArea();
        System.out.println("Area of room 2 is: " + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Total area of both your rooms is: " + totalArea + " sq. ft");
    }

}
