package org.example.data;

import java.time.LocalDate;

public record Order (String ID, LocalDate orderDate, double totalPrice) {
}
