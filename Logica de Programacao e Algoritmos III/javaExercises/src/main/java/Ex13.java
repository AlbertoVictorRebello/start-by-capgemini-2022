import java.util.Scanner;

public class Ex12 {
    static final float TAXES_FACTOR = 1.45f;
    static final float DEALER_FACTOR = 1.28f;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Pricing System ========================\n");

        System.out.println("Please, inform the factory cost of the car in USS:");
        float amount = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Pricing Report =======================");
        System.out.println();
        System.out.printf("The factory cost is: %.2f\n", amount);
        System.out.printf("The customer cost is: %.2f", amount * TAXES_FACTOR * DEALER_FACTOR);
        System.out.println();
    }
}
