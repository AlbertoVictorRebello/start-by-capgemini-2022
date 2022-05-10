package models;

public class FuelPump {
    private String fuelType;
    private float price;
    private float stok;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getStok() {
        return stok;
    }

    public void setStok(float stok) {
        if (this.stok <= stok) {
            System.out.printf("Replenishing the pump with %.2f liters of %s. New stock: %.2f.\n",
                    stok - this.stok, fuelType, stok);
        } else {
            System.out.printf("Emptying the pump of %.2f liters of %s. New stock: %.2f.\n",
                    stok - this.stok, fuelType, stok);
        }
        this.stok = stok;

    }

    public void supplyByValue(float amount) {
        float liters = amount / price;
        supplyByLiters(liters);

    }

    public void supplyByLiters(float liters) {
        if (liters >= 1) {
            if (liters <= stok) {
                stok -= liters;
                System.out.printf("Supplying %.2f liters of %s.\n", liters, fuelType);
            } else {
                System.out.println("There is not enough fuel in the pump. Actual stock: " + stok);
            }
        } else {
            System.out.printf("The minimal supply amount is US$ %.2f or 01 liter.\n", price);
        }
    }

    @Override
    public String toString() {
        return "FuelPump{" +
                "fuelType='" + fuelType + '\'' +
                ", price=" + price +
                ", stok=" + stok +
                '}';
    }
}
