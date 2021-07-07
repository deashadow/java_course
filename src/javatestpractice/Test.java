package javatestpractice;

/*
Here, the Java compiler chooses to call the overloaded method
with the most specific parameters. Which would be String
because the String class is more specific than the Object class.
 */
public class Test {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object o) {
        System.out.println("Object method");
    }
    public static void method(String s) {
        System.out.println("String method");
    }
}
