import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double p = 0;
        double r = 0;
        System.out.println("mortgage calc");
        while (true) {
            System.out.print("Principle(1,000-1,000,000): ");
            p = scanner.nextDouble();
            if (p >= 1_000 && p <= 1_000_000)
                break;
            else
                System.out.println("please enter a valid amount");
        }
        while (true) {
            System.out.print("rate(annual(1-30)): ");
            r = ((scanner.nextDouble() / 100) / 12);
            if (r > 0 && r <= 30)
                break;
            else
                System.out.println("[please enter a valid interest");
        }
        System.out.print("duration(years): ");
        double t = (scanner.nextDouble() * 12);
        double dom = Math.pow((1 + r), t);
        double mortgage = p * ((r * dom) / (dom - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double rounded = Math.rint(mortgage);
        System.out.println(rounded);
        System.out.println("your mortgage is :" + currency.format(mortgage) + " per month");

    }
}
