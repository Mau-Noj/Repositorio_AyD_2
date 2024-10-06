package SRP_fail;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos artículos
        Item item1 = new Item(100.0);
        Item item2 = new Item(150.0);
        Item item3 = new Item(50.0);

        // Añadir los artículos a una lista
        List<Item> items = Arrays.asList(item1, item2, item3);

        // Crear una orden con los artículos
        Order order = new Order(items);

        // Calcular el total
        double total = order.calculateTotal();
        System.out.println("Total: " + total);

        // Aplicar un descuento del 10%
        double totalConDescuento = order.applyDiscount(0.10);
        System.out.println("Total con descuento: " + totalConDescuento);

        // Procesar el envío
        order.processShipping("123 Main St, City");

        // Generar la factura
        order.generateInvoice();
    }
}
