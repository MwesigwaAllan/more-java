import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * int x = 10;
         * int y = ++x;
         * String num = "10";
         * int[] arr = { 1, 2, 3, 4, 5, 6 };
         * NumberFormat currency = NumberFormat.getCurrencyInstance();
         * NumberFormat percentage = NumberFormat.getPercentInstance();
         * String cent = percentage.format(40);
         * String result = currency.format(1233.1);
         * System.out.println(result + "percentage" + cent + arr);
         * int input = Integer.parseInt(num);
         * int add = input + y;
         * System.out.println(add);
         * System.out.println(x);
         * System.out.println(y);
         */

        // reading cli input

        /*
         * Scanner myScanner = new Scanner(System.in);
         * System.out.print("input age:");
         * byte age = myScanner.nextByte();
         * System.out.println("you are " + age + " years old");
         */

        // conditional operators and boolean primitives

        /*
         * int temp = 25;
         * boolean isWarm = temp > 20 && temp < 30;
         * System.out.println(isWarm);
         * temp = 31;
         * boolean isWarm2 = temp > 20 && temp < 30;
         * System.out.println(isWarm2);
         */

        /*
         * boolean hasHighIncome = true;
         * boolean hasGoodCredit = false;
         * boolean hasCriminalRecord = true;
         * boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
         * System.out.println(isEligible);
         */

        System.out.print("The temperature today is: ");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        int tempValue = Integer.parseInt(temp);
        switch (tempValue) {
            case (19):
                System.out.println("winters coming");
                break;
            case (40):
                System.out.println("armagedon is coming");
                break;
        }
        if (tempValue > 30) {
            System.out.println("its pretty hot stay hydrated");
        } else if (tempValue < 20) {
            System.out.println("carry a jacket");
        } else
            System.out.println("great weather");

        String shorter = tempValue > 30 ? "hot as day" : "not toohot";
        System.out.println(shorter);

    }

}
