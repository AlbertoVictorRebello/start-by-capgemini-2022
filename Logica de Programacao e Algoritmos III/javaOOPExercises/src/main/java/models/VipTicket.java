package models;

public class VipTicket extends Ticket{
    private float vipCharge = 1.25f;

    public VipTicket(float value) {
        super(value);
        this.value = value * vipCharge;
    }

}
