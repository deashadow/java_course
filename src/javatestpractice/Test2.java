package javatestpractice;

public class Test2 {
    public static void main(String[] arr){
        System.out.println(0.1*3 == 0.3);
        System.out.println(0.1*2 == 0.2);
    }
}
//This happens simply because of the rounding error
// in floating-point numbers. Only numbers that are
// powers of 2 can be represented precisely by a
// simple binary representation