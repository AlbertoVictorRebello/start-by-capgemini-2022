import java.util.Scanner;

public class Ex06 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {

        System.out.printf("==================== Juggling Game=========================\n");
        System.out.println("Please, inform the color of the ball on your left hand (A):");
        String  A = scanner.next();

        System.out.println("Please, inform the color of the ball on your right hand (B):");
        String  B = scanner.next();
        String swap = "";

        System.out.println();

        System.out.printf("                A = %s                B = %s                \n", A, B);

        System.out.printf("========================= Juggling =========================\n");

        swap = A;
        A = B;
        B = swap;
        System.out.printf("                A = %s              B = %s                ", A, B);
        System.out.println();

    }
}
