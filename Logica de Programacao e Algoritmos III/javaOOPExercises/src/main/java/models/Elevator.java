package models;

public class Elevator {
    private int actualFloor = 0;
    private int totalFloorNumber;
    private int capacity;
    private int actualOcupation = 0;

    public int getActualFloor() {
        return actualFloor;
    }

    public void setActualFloor(int actualFloor) {
        this.actualFloor = actualFloor;
    }

    public int getTotalFloorNumber() {
        return totalFloorNumber;
    }

    public void setTotalFloorNumber(int totalFloorNumber) {
        this.totalFloorNumber = totalFloorNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getActualOcupation() {
        return actualOcupation;
    }

    public void setActualOcupation(int actualOcupation) {
        this.actualOcupation = actualOcupation;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "actualFloor=" + actualFloor +
                ", totalFloorNumber=" + totalFloorNumber +
                ", capacity=" + capacity +
                ", actualOcupation=" + actualOcupation +
                '}';
    }

    public void initialize(int capacity, int floorsQuantity) {
        this.capacity = capacity;
        this.totalFloorNumber = floorsQuantity;
        actualFloor = 0;
    }

    public void getIn() {
        getIn(1);
    }

    public void getIn(int numberOfPersons) {
        if (actualOcupation == capacity) {
            System.out.println("Denied. The elevator is full.");
        } else if (actualOcupation + numberOfPersons > capacity){
            System.out.printf("Denied. Only %d may get into the elevator.\n", capacity - actualOcupation);
        } else {
            System.out.println("Number of people getting in the elevator: " + numberOfPersons);
            actualOcupation += numberOfPersons;
        }
    }

    public void getOut() {
        getOut(1);
    }

    public void getOut(int numberOfPersons) {
        if (actualOcupation == 0) {
            System.out.println("Denied. The elevator is empty.");
        } else if  (actualOcupation - numberOfPersons < 0) {
            System.out.printf("Denied. Only %d are in the elevator.\n", actualOcupation);
        } else {
            System.out.println("Number of people getting out the elevator: " + numberOfPersons);
            actualOcupation -= numberOfPersons;
        }
    }

    public void getUp() {
        getUp(1);
    }

    public void getUp(int numberOfFloors) {
        if (actualFloor == totalFloorNumber) {
            System.out.println("Denied. The elevator is at the roof top.");
        } else if (actualOcupation + numberOfFloors > totalFloorNumber) {
            System.out.printf("Denied. The elevator may move up %d floor(s).\n",
                    totalFloorNumber - actualFloor);
        } else {
            System.out.printf("The elevator is moving up %d floor(s).\n", numberOfFloors);
            actualFloor += numberOfFloors;
        }
    }

    public void getDown() {
        getDown(1);
    }

    public void getDown(int numberOfFloors) {
        if (actualFloor == 0) {
            System.out.println("Denied. The elevator is at the ground floor.");
        } else if (actualFloor - numberOfFloors < 0) {
            System.out.printf("Denied. The elevator may move down %d floor(s).\n",
                    actualFloor);
        } else {
            System.out.printf("The elevator is moving down %d floor(s).\n", numberOfFloors);
            actualFloor -= numberOfFloors;
        }
    }
}
