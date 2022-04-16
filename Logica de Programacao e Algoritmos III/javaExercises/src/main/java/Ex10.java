import java.util.Scanner;

public class Ex09 {
    static final float INVESTMENT_FACTOR = 1.07f;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Investment Bank ========================\n");

        System.out.println("Please, inform the invested amount in USS:");
        float amount = scanner.nextFloat();
        System.out.println("Please, inform the seller's salary:");


           System.out.println();
        System.out.printf("======================= Investment  Report =======================");
        System.out.println();
        System.out.printf("The total amount invested is: %.2f\n", amount);
        System.out.printf("The total amount available is: %.2f", amount * INVESTMENT_FACTOR);
        System.out.println();
    }
}
