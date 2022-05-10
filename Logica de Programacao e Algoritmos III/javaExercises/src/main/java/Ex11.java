import java.util.Scanner;

public class Ex11 {
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Pricing System ========================\n");

        System.out.println("Please, inform the cost of the product in USS:");
        float amount = scanner.nextFloat();

        System.out.println("Please, inform the margin in accordance with the product category in %:");
        float margin = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Pricing Report =======================");
        System.out.println();
        System.out.printf("The product cost is: %.2f\n", amount);
        System.out.printf("The product price is: %.2f", amount * (1 + margin/100));
        System.out.println();
    }
}
