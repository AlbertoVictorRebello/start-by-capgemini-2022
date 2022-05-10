import java.util.Scanner;

public class Ex34 {
    public static void execute(Scanner scanner) {
        int action = 1;
        int age = 0;

        System.out.printf("========================= Checking System =========================");
        System.out.println();
        System.out.println("Please, inform swimmers' age:");

        while (action == 1) {
            System.out.println("Age:");
            age = scanner.nextInt();
            if (age >= 5 && age <= 7) {
                System.out.println("Children's Category A");
            } else if (age >= 8 && age <= 10) {
                System.out.println("Children's Category B");
            } else if (age >= 11 && age <= 13) {
                System.out.println("Junior's Category A");
            } else if (age >= 14 && age <= 17) {
                System.out.println("Junior's Category B");

            } else if (age >= 18 && age <= 25) {
                System.out.println("Senior's Category");
            } else {
                System.out.println("This age does not match any category range.");
            }

            System.out.println("Please, choose an action:");
            System.out.println("1 - continue");
            System.out.println("2 - Stop");
            action = scanner.nextInt();
        }

    }
}
