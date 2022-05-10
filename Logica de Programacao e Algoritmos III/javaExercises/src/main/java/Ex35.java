import java.util.Scanner;

public class Ex35 {
    public static void execute(Scanner scanner) {
        int totalInput = 0;
        int action = 1;
        int type;
        float consumption = 0f;
        float price = 0f;

        System.out.printf("========================= Energy Pricing System =========================");
        System.out.println();
        System.out.println("Please, inform the consumption in KW/h and the installation type:");


        while (action == 1) {
            totalInput += 1;
            System.out.printf("Consumption of customer %d:\n", totalInput);
            consumption = scanner.nextFloat();
            System.out.println("Installation type:");
            System.out.println("1 - residential");
            System.out.println("2 - Commercial");
            System.out.println("3 - Industrial");
            type = scanner.nextInt();
            if (type == 1) {
                System.out.printf("This custumer shall pay USS %.2f.\n", consumption * 0.6f);
            } else if (type == 2) {
                    System.out.printf("This custumer shall pay USS %.2f.\n", consumption * 0.48f);
                } else {
                System.out.printf("This custumer shall pay USS %.2f.\n", consumption * 1.29f);
            }
            System.out.println("Please, choose an action:");
            System.out.println("1 - Continue");
            System.out.println("2 - Print the report");
            action = scanner.nextInt();

        }

        System.out.println();
        System.out.printf("========================= Energy Pricing System =========================");
        System.out.println();

        System.out.printf("The system checked the consumption price for %d customers.", totalInput);
        System.out.println();

    }
}
