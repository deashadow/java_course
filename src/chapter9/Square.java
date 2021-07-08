package chapter9;

public class Square extends Rectangle {

    @Override  //GOOD practice to use this annotation--lets java know that you
    //want to change the calculatePerimeter method
    public double calculatePerimeter(){
        return sides * length; //inherited from Rectangle SUPER CLASS
    }

    public void print(String what){ //overloaded this method from SUPER CLASS
        System.out.println("I am a " + what);
    }
}
