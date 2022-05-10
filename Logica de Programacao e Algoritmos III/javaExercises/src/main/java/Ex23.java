import java.util.Scanner;

public class Ex23 {
    public static void execute(Scanner scanner) {
        String status ="";
        System.out.printf("======================== Checking System ========================\n");

        System.out.println("Please, inform a number:");
        float number = scanner.nextFloat();

        if  (number == 40f) {
            status = "The number is equal to %.2f.";
        } else if (number > 80f) {
            status = "The number %.2f is greater than 80.00.";

        } else if (number < 25f) {
            status = "The number %.2f is lower than 25.00.";
        } else {
            status = "The number does not match any of the defined criteria.";
        }
        System.out.println();
        System.out.printf("======================= Checking Report =======================");
        System.out.println();
        System.out.printf(status, number);
    }
}
