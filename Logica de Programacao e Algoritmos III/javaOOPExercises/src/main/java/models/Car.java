package models;

public class Car {
    private final float FUEL_CAPACITY = 50f;
    private final float CONSUMPTION_PER_KM = 15f;
    private float tankLevel = 0f;
    private float odometer = 0f;

    public void supply(float liters) {
        if (tankLevel + liters > FUEL_CAPACITY) {
            System.out.println("Denied. Maximum quantity is " + (FUEL_CAPACITY - tankLevel));
        } else {
            tankLevel += liters;
            System.out.printf("Supplying %.2f of fuel.\n", liters);
        }
    }

    public void move(float kilometers) {
        if ( tankLevel * CONSUMPTION_PER_KM < kilometers) {
            System.out.printf("Denied. There are enough fuel to move only %.2f Kilometers\n", getAutonomy());
        } else {
            tankLevel -= (kilometers / CONSUMPTION_PER_KM);
            odometer += kilometers;
        }
    }

    private float getAutonomy() {
        return tankLevel * CONSUMPTION_PER_KM;
    }

    public float getTankLevel() {
        return tankLevel;
    }

    public float getOdometer() {
        return odometer;
    }
}
