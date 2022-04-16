import java.util.Scanner;

public class Ex05 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {

        System.out.println("Please, inform the seller's name:");
        String name = scanner.next();
        System.out.println("Please, inform the seller's salary:");
        float  salary = scanner.nextFloat();
        System.out.println("Please, inform the seller's sold value:");
        float  soldValue = scanner.nextFloat();

           System.out.println();
        System.out.printf("======================== Monthly Report ========================");
        System.out.println();
        System.out.printf("Seller name: %s", name);
        System.out.printf(" - Salary: %.2f ", salary);
        System.out.printf(" - Sold value: %.2f\n", soldValue);
        System.out.printf("Total Salary: %.2f\n", salary + soldValue * COMMISSION_FACTOR );
    }
}
