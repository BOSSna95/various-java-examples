package org.example.data;

import java.util.List;

public record Customer(String firstName, String lastName, String address, int phoneNumber, List<Account> accounts) {
}
