package org.example.data;

import java.util.List;

public class Account {

    int accountID;
    AccountType accountType;
    int balance;
    List<Transaction> transactions;


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

    public void setAccountID(int accountID) {this.accountID = accountID;}
    public void setAccountType(AccountType accountType) {this.accountType = accountType;}
    public void setBalance(int balance) {this.balance = balance;}
    public void setTransactions(List<Transaction> transactions) {this.transactions = transactions;}


    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", accountType=" + accountType +
                ", balance=" + balance +
                '}';
    }
}
