import java.util.Scanner;

public class Ex27 {
    public static void execute(Scanner scanner) {
        int fuelType;
        float price = 0f;
        float discount = 0f;
        float totalRevenue = 0f;
        float totalDiscount = 0f;

        System.out.printf("========================= Pricing System =========================");
        System.out.println();
        System.out.println("Please, input the car information: price and fuel type:");

        System.out.println("Price:");
        price = scanner.nextFloat();
        while (price > 0f) {
            totalRevenue += price;
            System.out.println("Fuels type:");
            System.out.println("1 - gasoline:");
            System.out.println("2 - diesel:");
            System.out.println("3 - alcohol");
            fuelType = scanner.nextInt();

            if (fuelType == 1) {
                discount = price * 0.21f;
                System.out.printf("The price of %.2f can be reduced by %.2f. Final price %.2f\n",
                        price, discount, price - discount);
                totalDiscount += discount;
            } else if (fuelType == 2){
                discount = price * 0.14f;
                System.out.printf("The price of %.2f can be reduced by %.2f. Final price %.2f\n",
                        price, discount, price - discount);
                totalDiscount += discount;
            } else {
                discount = price * 0.25f;
                System.out.printf("The price of %.2f can be reduced by %.2f. Final price %.2f\n",
                        price, discount, price - discount);
                totalDiscount += discount;
            }
            System.out.println("Price:");
            price = scanner.nextFloat();
        }

        System.out.println();
        System.out.printf("========================= Pricing Report =========================");
        System.out.println();
        System.out.printf("Total revenue before discount: %.2f.\n", totalRevenue);
        System.out.printf("Total discount: %.2f.\n", totalDiscount);
        System.out.printf("Final revenue: %.2f.\n", totalRevenue - totalDiscount);
        System.out.println();

    }
}
