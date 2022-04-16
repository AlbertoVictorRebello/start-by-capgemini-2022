import java.util.Scanner;

public class Ex03 {
    public static void execute(Scanner scanner) {
        System.out.println("Please, inform the distance in Km:");
        float a = scanner.nextFloat();

        System.out.println("Please, inform the fuel consumed in liters:");
        float b = scanner.nextFloat();

        if (a <= 0 || b <= 0) {
            System.out.println("Please, inform positive values only.");
        } else {
            System.out.printf("The average consumption was %.2f.", a / b);

        }
    }
}
