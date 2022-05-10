import java.util.Scanner;

public class Ex31 {
    public static void execute(Scanner scanner) {
        System.out.println("========================= Calculator =========================");
        System.out.println("Please, inform two numbers and the chosen operation:");
        System.out.println("Number 1");
        int a = scanner.nextInt();
        System.out.println("Number 2");
        int b = scanner.nextInt();
        System.out.println("Chosen operation: +, -, * or /:");
        String symbol = scanner.next();

        operation(a, b, symbol);

    }

    private static void operation(int a, int b, String operation) {

        switch (operation) {
            case "+":
                System.out.printf("The sum of %d + %d is %d\n", a, b, a + b);
                break;

            case "-":
                System.out.printf("The subtraction of %d - %d is %d\n", a, b, a - b);
                break;

            case "*":
                System.out.printf("The product of %d + %d is %d\n", a, b, a * b);
                break;

            case "/":
                if (b == 0 ) {
                    System.out.printf("The division of %d + %d failed. A division by zero will cause an runtime error.", a, b);
                } else {
                    System.out.printf("The division of %d + %d is %.2f", a, b, (float) a / b);
                }

                break;

            default:
                System.out.println("Undefined operator. Please, contact the system administrator.");
        }

    }
}
