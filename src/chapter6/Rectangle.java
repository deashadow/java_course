package chapter6;

public class Rectangle { //this is meant to be a generalized shell-BLUEPRINT
    //that can be used later on---so main method--it is an 'object'
//this is Encapsulation-- fields private,,  getters/setters public
    private double length;  //called fields--cannot directly access field when private
    private double width;  //called fields
//that is what getter and setters are for to allow to obtain values
 //can use a constructor as well to set state
    public Rectangle(){
        length = 0;
        width = 0;
    }
 //another constructor
    public Rectangle(double length, double width){
        this.length = length; //can be set this way or
        setWidth(width); //or this way.  Here to demo alternatives
    }
//obtain getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length; //the 'this' means using field in line 6
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }



    double calculatePerimeter(){  //this is a method
        return (2*length)+(2*width);
    }

    double calculateArea(){
        return (length*width);
    }
}
