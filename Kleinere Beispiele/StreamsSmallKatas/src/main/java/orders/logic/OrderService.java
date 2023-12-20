package orders.logic;

import orders.data.Order;

import java.util.List;

public class OrderService {
    //Prüfe, ob eine Liste von Bestellungen mindestens eine Bestellung über 100€ enthält.
    public boolean isThereOrderMoreThanAmount(List<Order> orders, double amount) {
        return orders.stream()
                .anyMatch(order -> order.totalAmount() > amount);
    }
}
