package chapter9;

public class BirthdayCake extends Cake{

    private int candles;

    public BirthdayCake(){
        super("vanilla");
        setCandles(15);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
