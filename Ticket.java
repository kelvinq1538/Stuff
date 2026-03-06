import java.util.*;

public class Ticket {

    private static double currentPrice = 25.0;
    private double ticketPrice;
    private String serialNumber;

    private static ArrayList<String> listOfSerialNumbers = new ArrayList<>();
    private static Random rand = new Random(100);

    public Ticket() {
        ticketPrice = currentPrice;
        currentPrice += 0.5;
        serialNumber = getNextSerialNumber();
    }

    public double getPrice() {
        return ticketPrice;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return "Number: " + serialNumber + "\nPrice: $" + String.format("%.2f", getPrice());
    }

    private static String getNextSerialNumber() {
        String s = "";

        while(true) {
            s = "";

            for(int i = 0; i < 16; i++) {
                int val = rand.nextInt(36);

                if(val < 10)
                    s += val;
                else
                    s += (char)('A' + (val - 10));
            }

            if(!listOfSerialNumbers.contains(s)) {
                listOfSerialNumbers.add(s);
                return s;
            }
        }
    }

    public static void reset() {
        currentPrice = 25.0;
        listOfSerialNumbers.clear();
        rand = new Random(100);
    }
}
