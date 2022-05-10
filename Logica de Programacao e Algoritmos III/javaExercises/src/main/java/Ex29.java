import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Scanner;

public class Ex29 {
    public static void execute(Scanner scanner) {

        String[] months = {
                "january",
                "february",
                "march",
                "april",
                "may",
                "june",
                "july",
                "august",
                "september",
                "october",
                "november",
                "december"
        };

        System.out.println("Please, inform the month number:");
        int input = scanner.nextInt();

        if (input >=1 && input <= 12) {
            System.out.println(months[input - 1]);
        } else {
            System.out.println("Invalid month number. Try again.");
        }
    }
}
