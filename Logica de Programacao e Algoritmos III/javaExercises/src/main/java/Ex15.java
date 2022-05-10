import java.util.Scanner;

public class Ex15 {
    static final float TAXES_FACTOR = 1.45f;
    static final float DEALER_FACTOR = 1.28f;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Checking System ========================\n");

        System.out.println("Please, inform a number:");
        float number = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Checking Report =======================");
        System.out.println();
        System.out.printf("The number %.2f %s between 100 and 200:\n",
                number, number >= 100 && number <= 200 ? "is" : "is not");
        System.out.println();
    }
}
