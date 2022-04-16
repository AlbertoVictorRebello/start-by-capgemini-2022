import java.util.Scanner;

public class Ex13 {
    static final float TAXES_FACTOR = 1.45f;
    static final float DEALER_FACTOR = 1.28f;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Checking System ========================\n");

        System.out.println("Please, inform your number:");
        float number = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Checking Report =======================");
        System.out.println();
        System.out.printf("The number %.2f %s greater than 10:\n", number, number > 10 ? "is" : "is not");
        System.out.println();
    }
}
