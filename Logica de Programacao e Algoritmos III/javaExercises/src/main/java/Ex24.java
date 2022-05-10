import java.util.Scanner;

public class Ex24 {
    public static void execute(Scanner scanner) {
        float number;
        System.out.printf("======================== Checking System ========================\n");

        int action = 1;
        while (action == 1) {
            System.out.println("Please, inform a number:");
            number = scanner.nextFloat();

            System.out.printf("The number %.2f is %s.\n\n",
                    number, number > 0 ? "positive" : "negative");

            System.out.println("Please, choose an action:");
            System.out.println("1 - continue");
            System.out.println("2 - Stop");
            action = scanner.nextInt();
        }



    }
}
