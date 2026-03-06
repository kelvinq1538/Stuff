public class StudentAdvance extends Advance {

    public StudentAdvance(int d) {
        super(d);
    }

    public double getPrice() {
        return super.getPrice() * 0.50;
    }

    public String toString() {
        return super.toString() + "\n(student ID requiered)";
    }
}
