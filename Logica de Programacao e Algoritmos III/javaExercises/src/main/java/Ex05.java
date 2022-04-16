import java.util.Scanner;

public class Ex05 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {

        System.out.println("Please, inform the student's name:");
        String name = scanner.next();
        System.out.println("Please, inform the notes of this semester:");
        System.out.println("Note 1:");
        float  note1 = scanner.nextFloat();

        System.out.println("Note 2:");
        float  note2 = scanner.nextFloat();

        System.out.println("Note 3:");
        float  note3 = scanner.nextFloat();

           System.out.println();
        System.out.printf("========================= Evaluation Report =========================");
        System.out.println();
        System.out.printf("Student name: %s", name);
        System.out.printf(" - Note 1: %.2f - Note 2: %.2f - Note 3: %.2f\n", note1, note2, note3);
        System.out.printf("Average note: %.2f ", (note1 + note2 + note3) / 3);

    }
}
