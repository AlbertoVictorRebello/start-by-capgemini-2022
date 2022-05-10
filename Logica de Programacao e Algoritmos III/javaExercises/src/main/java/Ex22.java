import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex22 {
    public static void execute(Scanner scanner) {
        int counter = 0;
        int action = 1;
        List<Product> products = new ArrayList<>();

        System.out.println("========================= Pricing System =========================");
        System.out.println("Please, inform the information for each product:");


        while (action == 1) {
            Product newProduct = new Product();
            System.out.println("Name:");
            newProduct.setName(scanner.next());
            System.out.println("Cost:");
            newProduct.setCost(scanner.nextFloat());
            System.out.println("Price:");
            newProduct.setPrice(scanner.nextFloat());

            products.add(newProduct);
            System.out.print("Registered: ");
            System.out.println(newProduct);

            if (Product.totalNumberOfProducts == 40) {
                action = 2;
                System.out.println("The system already registered 40 products. Please, check the report\n.");
            } else {
                System.out.println("Please, choose an action:");
                System.out.println("1 - continue");
                System.out.println("2 - Print report");
                action = scanner.nextInt();
            }
        }

        System.out.println("======================== Pricing Report Summary =========================");
        System.out.println("Total number of products  registered: " + Product.totalNumberOfProducts);
        System.out.printf("Total cost: %.2f ", Product.totalCost);
        System.out.println("Average Cost: " + (Product.totalCost / Product.totalNumberOfProducts));
        System.out.printf("Total revenue: %.2f ", Product.totalRevenue);
        System.out.println("Average revenue: " + (Product.totalRevenue / Product.totalNumberOfProducts));
        System.out.println("Overall operation result " + (Product.totalRevenue -  Product.totalCost));

        System.out.println("======================= Detailed Pricing Report ==========================");
        for (Product item : products) {
            String status = "";
            if (item.getPrice() - item.getCost() > 0) {
                status = "positive margin";

            } else if (item.getPrice() - item.getCost() < 0) {
                status = "negative margin";
            } else {
                status = "null margin";
            }

            System.out.printf("Name: %s - cost: %.2f - price: %.2f - %s", item.getName(), item.getCost(), item.getPrice(), status);
            System.out.println();

        }

    }

}

class Product {
    protected static int totalNumberOfProducts = 0;
    protected static float totalCost = 0;
    protected static float totalRevenue = 0;
    protected static float averageCost = 0;
    protected static float averagePrice = 0;
    private String name;
    private float cost;
    private float price;

    public Product() {
        totalNumberOfProducts++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {

        this.cost = cost;
        totalCost += cost;
    }

    public void setPrice(float price) {
        this.price = price;
        totalRevenue += price;
    }

    public static int getTotalnumberOfProducts() {
        return totalNumberOfProducts;
    }

    public static float getTotalCost() {
        return totalCost;
    }

    public static float getTotalRevenue() {
        return totalRevenue;
    }

    public static float getAverageCost() {
        return averageCost;
    }

    public static float getAveragePrice() {
        return averagePrice;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                '}';
    }
}
