import java.util.Scanner;

public class Ex32 {
    public static void execute(Scanner scanner) {
        System.out.println("========================= Triangle builder System =========================");
        System.out.println("Please, inform three integer values to be check:");
        System.out.println("Value 1");
        int value1 = scanner.nextInt();

        System.out.println("Value 2");
        int value2 = scanner.nextInt();

        System.out.println("Value 3");
        int value3 = scanner.nextInt();

        if (value1 <= value2 + value3 && value2 <= value1 + value3 && value3 <= value2 + value1) {
            if (value1 == value2 && value1 == value3 && value2 == value3) {
                System.out.println("Equilateral triangle");
            } else if (value1 == value2 || value1 == value3 || value2 == value3) {
                System.out.println("Isosceles triangle");
            } else  {
                System.out.println("Scalene triangle");
            }


        } else  {
            System.out.println("The values informed are invalid to build a triangle.");
        }



    }
}
