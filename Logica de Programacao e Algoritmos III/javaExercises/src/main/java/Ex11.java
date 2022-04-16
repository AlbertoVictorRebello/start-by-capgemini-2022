import java.util.Scanner;

public class Ex10 {
    static final float PARCELS_NUMBER = 5;
    public static void execute(Scanner scanner) {
        System.out.printf("======================== Mamão com Açúcar Store ========================\n");

        System.out.println("Please, inform the purchase cost in USS:");
        float amount = scanner.nextFloat();

        System.out.println();
        System.out.printf("======================= Purchase Report =======================");
        System.out.println();
        System.out.printf("The total purchase cost is: %.2f\n", amount);
        System.out.printf("The 5 monthly payment value is: %.2f", amount / PARCELS_NUMBER);
        System.out.println();
    }
}
