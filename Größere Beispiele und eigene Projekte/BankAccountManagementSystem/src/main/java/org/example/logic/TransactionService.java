package org.example.logic;

import org.example.data.*;

import java.time.LocalDate;
import java.util.List;

public class TransactionService {

    public void transferByName(List<Customer> customers, String transferer, String receiver, int amount, LocalDate transactionDate) {
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
                    account.getTransactions().add(new Transaction(TransactionType.DEPOSIT, amount, transactionDate));
                });
    }


    public void transferByAccountID(List<Customer> customers, int transfererAccountID, int receiverAccountID,
                                    int amount, LocalDate transactionDate) {
        customers.stream().flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getAccountID() == transfererAccountID).
                forEach(account -> {
                    account.setBalance(account.getBalance() - amount);
                    account.getTransactions().add(new Transaction(TransactionType.WITHDRAWAL, -amount, transactionDate));
                });

        customers.stream().flatMap(customer -> customer.accounts().stream()).
                filter(account -> account.getAccountID() == receiverAccountID).
                forEach(account -> {
                    account.setBalance(account.getBalance() + amount);
                    account.getTransactions().add(new Transaction(TransactionType.DEPOSIT, amount, transactionDate));
                });
    }
}
