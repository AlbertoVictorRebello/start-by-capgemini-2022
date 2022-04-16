import java.util.Scanner;

public class Ex07 {
    static final float COMMISSION_FACTOR = 0.15f;
    public static void execute(Scanner scanner) {

        System.out.printf("==================== Temperature Conversor ========================\n");
        System.out.println("Please, inform the temperature in Celsius degrees ºC:");
        float celsiusTemperature = scanner.nextFloat();


        float farenheitTemperature = (9 * celsiusTemperature + 160) / 5;

        System.out.printf("The temperature %.2f ºC is equivalent to %.2f ºF", celsiusTemperature, farenheitTemperature);

    }
}
