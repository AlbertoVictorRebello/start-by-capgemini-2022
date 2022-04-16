import java.util.Scanner;

public class Ex16 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {
        String name, status = "";
        float note1 = 0f, note2 = 0f, note3 = 0f, averageNote = 0f;

        System.out.printf("========================= Evaluation System =========================");
        System.out.println("Please, inform the student's name:");
        name = scanner.next();
        System.out.println("Please, inform the notes of this semester:");
        System.out.println("Note 1:");
        note1 = scanner.nextFloat();

        System.out.println("Note 2:");
        note2 = scanner.nextFloat();

        System.out.println("Note 3:");
        note3 = scanner.nextFloat();

        averageNote = (note1 + note2 + note3) / 3;


        if (averageNote >= 7f) {
            status = "Passing Grade";
        } else if ( averageNote >= 5.1f) {
            status = "Recovery Grade";
        } else  {
            status = "Fail Grade";
        }

           System.out.println();
        System.out.printf("========================= Evaluation Report =========================");
        System.out.println();
        System.out.printf("Student name: %s", name);
        System.out.printf(" - Note 1: %.2f - Note 2: %.2f - Note 3: %.2f\n", note1, note2, note3);
        System.out.printf("Average note: %.2f - %s", averageNote, status);

    }
}
