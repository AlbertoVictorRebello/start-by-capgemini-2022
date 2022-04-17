import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex30 {
    public static void execute(Scanner scanner) {
        int[] numbers = new int[3];

        System.out.println("Please, inform 3 numbers:");
        System.out.println("Number 1:");
        numbers[0] = scanner.nextInt();
        System.out.println("Number 2:");
        numbers[1] = scanner.nextInt();
        System.out.println("Number 3:");
        numbers[2] = scanner.nextInt();

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }
}
