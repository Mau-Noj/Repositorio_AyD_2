package SRP_fail;

import java.util.List;

public class Order {
    private List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double applyDiscount(double discount) {
        double total = calculateTotal();
        return total - (total * discount);
    }

    public void processShipping(String address) {
        System.out.println("Processing shipping to " + address);
    }

    public void generateInvoice() {
        System.out.println("Generating invoice for the order");
    }
}
