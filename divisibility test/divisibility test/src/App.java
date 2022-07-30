import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input test number: ");
        int testNumber = Integer.parseInt(scanner.nextLine());
        if (testNumber % 5 == 0 && testNumber % 3 == 0)
            System.out.println("fizzy buzzy");
        else if (testNumber % 3 == 0)
            System.out.println("buzz");
        else if (testNumber % 5 == 0)
            System.out.println("fizz");
        else
            System.out.println("nada");
    }
}// tests whether a number is divisible by 3 or 5
