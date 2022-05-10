import java.util.Scanner;

public class Ex25 {
    public static void execute(Scanner scanner) {
        float number1, number2;
        System.out.printf("======================== Checking System ========================\n");

        int action = 1;
        while (action == 1) {
            System.out.println("Please, inform number 1:");
            number1 = scanner.nextFloat();

            System.out.println("Please, inform number 2:");
            number2 = scanner.nextFloat();

            if (number1 == number2) {
                System.out.println("Both numbers are equal.");
            } else {
                System.out.printf("Given the number %.2f and %.2f, the greater is %.2f.\n\n",
                        number1, number2, number1 > number2 ? number1 : number2);
            }

            System.out.println("Please, choose an action:");
            System.out.println("1 - continue");
            System.out.println("2 - Stop");
            action = scanner.nextInt();
        }
    }
}
