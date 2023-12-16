package org.example.logic;

import org.example.data.*;

import java.time.LocalDate;
import java.util.List;

public class TransactionService {

    public void transfer(List<Customer> customers, String transferer, String receiver, int amount, LocalDate transactionDate) {
        customers.stream().filter(customer -> customer.firstName().equalsIgnoreCase(transferer)).
                flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getAccountType().equals(AccountType.SAVINGS)).
                forEach(account -> {
                    account.setBalance(account.getBalance() - amount);
                    account.getTransactions().add(new Transaction(TransactionType.WITHDRAWAL, amount, transactionDate));
                });

        customers.stream().filter(customer -> customer.firstName().equalsIgnoreCase(receiver)).
                flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getAccountType().equals(AccountType.SAVINGS)).
                forEach(account -> {
                    account.setBalance(account.getBalance() + amount);
                    account.getTransactions().add(new Transaction(TransactionType.WITHDRAWAL, amount, transactionDate));
                });
    }
}
