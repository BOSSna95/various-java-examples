package org.example.data;

import java.time.LocalDate;

public record Transaction(TransactionType transactionType, int amount, LocalDate date) {
}
