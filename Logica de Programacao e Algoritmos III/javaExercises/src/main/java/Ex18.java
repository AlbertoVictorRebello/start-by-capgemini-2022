import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {
    public static void execute(Scanner scanner) {
        String name, status = "";
        int age = 0;

        System.out.printf("========================= Checking System =========================");
        System.out.println();
        System.out.println("Please, inform 80 person's ages:");

        for (int i = 0; i < 75; i++) {
            System.out.printf("Age  %d:\n", i + 1);
            age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("It is an adult");
            } else if (age >= 0){
                System.out.println("It is not an adult");
            } else {
                System.out.println("It is not a valid age");
            }
        }

    }
}
