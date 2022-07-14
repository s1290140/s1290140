import java.util.*;

public class Heads_or_Tails {
    public static void main(String[] args) {
        String[] HoT = { "Heads", "Tails" };
        Random r = new Random();
        int round = 1;
        int[] count = { 0, 0 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Who are you?");
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Tossing a coin...");
        for (int i = 0; i < 3; i++) {
            String hot = HoT[r.nextInt(2)];
            System.out.println("Round" + round + ": " + hot);
            round++;

            if (hot == "Heads")
                count[0]++;
            else
                count[1]++;
        }

        System.out.println("Heads: " + count[0] + ", Tails: " + count[1]);

        if (count[0] > count[1])
            System.out.println(name + " won!");
        else
            System.out.println(name + " lost!");
    }
}