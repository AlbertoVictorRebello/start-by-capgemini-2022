import java.util.Scanner;

public class Ex26 {
    public static void execute(Scanner scanner) {
        int number;
        System.out.printf("======================== Checking System ========================\n");
        System.out.println("Please, inform an integer number from 1 to 5 inclusive:");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("one");
                break;

            case 2:
                System.out.println("two");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("four");
                break;

            case 5:
                System.out.println("five");
                break;

            default:
                System.out.println("Invalid number");
                break;
        }
    }
}
