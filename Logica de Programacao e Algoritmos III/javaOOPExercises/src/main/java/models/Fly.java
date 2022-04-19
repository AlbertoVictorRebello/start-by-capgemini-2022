package models;

import java.util.Arrays;

public class Fly {
    private final int CAPACITY = 100;
    private int flyNumber;
    MyDate flyDate;
     private int[] chairs = new int[100];

    public Fly(int flyNumber, MyDate flyDate) {
        this.flyNumber = flyNumber;
        this.flyDate = flyDate;
        Arrays.fill(chairs, 0);
    }

    public int getFlyNumber() {
        return flyNumber;
    }

    public void setFlyNumber(int flyNumber) {
        this.flyNumber = flyNumber;
    }

    public MyDate getFlyDate() {
        return flyDate;
    }

    public void setFlyDate(MyDate flyDate) {
        this.flyDate = flyDate;
    }

    public int getAvailableChairsQuantity() {
        return CAPACITY - Arrays.stream(chairs).reduce(Integer::sum).getAsInt();
    }
    public int getNextAvailable() {
        int emptyChair;

        for (emptyChair = 0; emptyChair < 100; emptyChair++) {
            if (chairs[emptyChair] == 0) break;
        }
        return emptyChair;
    }

    public void setAvailable(int chairNumber) {
        chairs[chairNumber] = 1;
    }
}
