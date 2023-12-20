package org.example.data;

import java.util.List;

public class Account {

    private final int accountID;
    private final AccountType accountType;
    private int balance;
    private final List<Transaction> transactions;


    public Account(int accountID, AccountType accountType, int balance, List<Transaction> transactions) {
        this.accountID = accountID;
        this.accountType = accountType;
        this.balance = balance;
        this.transactions = transactions;
    }

    public int getAccountID() {return accountID;}
    public AccountType getAccountType() {return accountType;}
    public int getBalance() {return balance;}
    public List<Transaction> getTransactions() {return transactions;}

    public void setBalance(int balance) {this.balance = balance;}


    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }
}
