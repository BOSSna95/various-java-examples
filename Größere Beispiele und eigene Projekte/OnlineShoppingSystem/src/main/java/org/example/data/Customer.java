package org.example.data;

import java.util.List;

public record Customer (String name, String addresse, String email, List<Order> orders) {
}
