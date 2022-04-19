package models;

public class Ticket {
    protected float value;

    public Ticket(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String printValue() {
        return String.format("Ticket value: %.2f", value);
    }
}
