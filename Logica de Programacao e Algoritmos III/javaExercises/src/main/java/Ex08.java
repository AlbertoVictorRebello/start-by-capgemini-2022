import java.util.Scanner;

public class Ex08 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {

        System.out.printf("==================== Exchange Bank ========================\n");
        System.out.println("Please, inform the total amount in dollar:");
        float amountUSS = scanner.nextFloat();

        System.out.println("Please, inform the rate:");
        float rate = scanner.nextFloat();

        float amountBRL = amountUSS * rate;

        System.out.printf("The total amount in USS is %.2f\n", amountUSS);
        System.out.printf("The rate is %.2f\n", rate);
        System.out.printf("The total amount in BRL is %.2f", amountBRL);
        System.out.println();

    }
}
