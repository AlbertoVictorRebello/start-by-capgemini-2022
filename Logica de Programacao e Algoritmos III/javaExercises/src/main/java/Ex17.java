import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ex17 {
    public static void execute(Scanner scanner) {
        String name, status = "";
        float number = 0f;
        int counter = 0;
        float[] numbers = new float[80];

        System.out.printf("========================= Checking System =========================");
        System.out.println();
        System.out.println("Please, inform 80 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Number %d:", i + 1);
            number = scanner.nextFloat();
            if (number >= 10f && number <= 150f) {
                counter += 1;
            }
            numbers[i] = number;
        }


           System.out.println();
        System.out.printf("========================= Evaluation Report =========================");
        System.out.println();
        System.out.println("The numbers informed are:");
        System.out.println(Arrays.toString(numbers));
        System.out.printf("%d of them are between 10 and 150.", counter);
        System.out.println();

    }
}
