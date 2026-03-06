import java.util.*;

public class TheBigEvent {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int seed = scan.nextInt();
        int days = scan.nextInt();

        Random rand = new Random(seed);

        ArrayList<Ticket> tickets = new ArrayList<>();

        int day = days;

        while(day > 0) {

            int type = rand.nextInt(2);

            if(type == 0)
                tickets.add(new StudentAdvance(day));
            else
                tickets.add(new Advance(day));

            int next = rand.nextInt(6);

            if(next == 0)
                day--;
        }

        int walk = rand.nextInt(50);

        while(walk != 0) {
            tickets.add(new Walkup());
            walk = rand.nextInt(50);
        }

        double total = 0;

        for(Ticket t : tickets) {
            System.out.println(t);
            total += t.getPrice();
        }

        System.out.println("Number of tickets sold: " + tickets.size());
        System.out.println("Total gate: $" + String.format("%.2f", total));
    }
}
