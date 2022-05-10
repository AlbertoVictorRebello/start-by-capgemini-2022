import java.util.Scanner;

public class Ex20 {
    public static void execute(Scanner scanner) {
        int counterUpTo2000 = 0;
        int year = 0;
        int totalInput = 0;
        int action = 1;
        float price = 0f;

        System.out.printf("========================= Pricing System =========================");
        System.out.println();
        System.out.println("Please, inform the car information: year and price:");


        while (action == 1) {
            totalInput += 1;
            System.out.printf("Year of the car %d:\n", totalInput);
            year = scanner.nextInt();
            System.out.println("Price:\n");
            price = scanner.nextFloat();
            if (year <= 2000) {
                System.out.printf("This car year %d, may be sold 12%s off: %.2f.\n",year, "%",  price * 0.88f);
                counterUpTo2000 += 1;
            } else {
                System.out.printf("This car year %d, may be sold 7%s off: %.2f.\n",year, "%", price * 0.93f);
            }

            System.out.println("Please, choose an action:");
            System.out.println("1 - Continue");
            System.out.println("2 - Print the report");
            action = scanner.nextInt();

        }

        System.out.println();
        System.out.printf("========================= Pricing Report =========================");
        System.out.println();
        System.out.printf("There was informed %d cars older than 2001.\n", counterUpTo2000);
        System.out.printf("The system checked the pricing descent for %d cars.", totalInput);
        System.out.println();

    }
}
