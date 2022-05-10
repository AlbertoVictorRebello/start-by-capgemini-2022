import java.util.Scanner;

public class Ex14 {
    static final float TAXES_FACTOR = 1.45f;
    static final float DEALER_FACTOR = 1.28f;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Checking System ========================\n");

        System.out.println("Please, inform number 1:");
        float number1 = scanner.nextFloat();

        System.out.println("Please, inform number 2:");
        float number2 = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Checking Report =======================");
        System.out.println();
        System.out.printf("Given the numbers %.2f and %.2f, the greatest is %.2f:\n",
                number1, number2, number1 > number2 ? number1 : number2);
        System.out.println();
    }
}
