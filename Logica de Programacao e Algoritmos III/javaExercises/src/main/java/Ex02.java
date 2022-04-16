import java.util.Scanner;

public class Ex02 {
    public static void execute(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        operation(a, b, "+");
        operation(a, b, "-");
        operation(a, b, "*");
        operation(a, b, "/");
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
        }

    }
}
