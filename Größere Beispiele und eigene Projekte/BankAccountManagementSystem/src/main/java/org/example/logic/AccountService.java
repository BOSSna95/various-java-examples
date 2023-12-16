package org.example.logic;

import org.example.data.Account;
import org.example.data.Customer;

import java.util.List;

public class AccountService {

    public List<Account> getAccountWithAmountGreaterThan1(List<Customer> customers, int balance) {
        return customers.stream().flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getBalance() > balance).toList();
    }

    public List<Account> getAccountWithAmountLowerThan1(List<Customer> customers, int balance) {
        return customers.stream().flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getBalance() < balance).toList();
    }
}
