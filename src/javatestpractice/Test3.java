package javatestpractice;

public class Test3 {
    public static void main(String[] args){
        System.out.println("main method");
    }
    public static void main(String args){
        System.out.println("Overloaded main method");
    }
}
/*
It prints “main method”. There will be no error or exception
 because the main method can be overloaded in Java. It has
 to be called from within the main method to be executed
  just like any other method.
 */