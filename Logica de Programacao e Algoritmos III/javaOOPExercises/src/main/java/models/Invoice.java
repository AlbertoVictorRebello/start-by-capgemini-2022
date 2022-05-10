package models;

import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private int invoiceNumber;
    String customerName;
    List<Item> items = new ArrayList<>();

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<Item> getItems() {
        return items;
    }
    public Item getItemById(int id) {
        return items.get(id);
    }
    public void setItem(Item item) {
        this.items.add(item);
    }

    public float getInvoiceAmount() {
        float total = 0f;
        for (Item i : items
             ) {
            total += i.unitPrice * i.quantity;
        }
        return total;
    }
}

