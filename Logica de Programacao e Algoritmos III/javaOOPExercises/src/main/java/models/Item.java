package models;

public class Item {
    int itemId;
    String description;
    int quantity;
    double unitPrice;

    public Item(int id, String description, int quantity, double unitPrice) {
        this.itemId = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = quantity;
        } else {
            this.quantity = quantity;
        }
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            this.unitPrice = 0;
        } else {
            this.unitPrice = unitPrice;
        }
    }
}
