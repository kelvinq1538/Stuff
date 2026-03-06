public class Walkup extends Ticket {

    public Walkup() {
        super();
    }

    public double getPrice() {
        return super.getPrice() * 1.10;
    }
}
