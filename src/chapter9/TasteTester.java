package chapter9;

public class TasteTester {

    public static void main(String[] args){ //Main method for Cake
        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        //birthdayCake.getCandles(15);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());
        System.out.println("Birthday cake candles: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());

    }
}
