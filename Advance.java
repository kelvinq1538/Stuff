public class Advance extends Ticket {

    private int days;

    public Advance(int d) {
        super();
        days = d;
    }

    public double getPrice() {
        if(days >= 10)
            return super.getPrice() * 0.90;
        else
            return super.getPrice();
    }
}
