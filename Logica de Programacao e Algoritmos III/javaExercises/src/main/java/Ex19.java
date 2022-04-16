import java.util.Arrays;
import java.util.Scanner;

public class Ex19 {
    public static void execute(Scanner scanner) {
        String name;
        int gender = 0;
        int counter = 0;
        int totalInput = 56;

        System.out.printf("========================= Checking System =========================");
        System.out.println();
        System.out.println("Please, inform 80 person's name and gender:");

        for (int i = 0; i < totalInput; i++) {
            System.out.printf("Name  %d:\n", i + 1);
            name = scanner.next();
            System.out.println("Please, inform its gender:");
            System.out.println("1 - Female");
            System.out.println("2 - Male");
            gender = scanner.nextInt();
            if (gender == 1) {
                System.out.printf("%s is female.\n", name);
                counter += 1;
            } else {
                System.out.printf("%s is male.\n", name);
            }

        }

        System.out.println();
        System.out.printf("========================= Evaluation Report =========================");
        System.out.println();
        System.out.printf("There was informed %d females and %d males.:", counter, totalInput - counter );
        System.out.println();

    }
}
