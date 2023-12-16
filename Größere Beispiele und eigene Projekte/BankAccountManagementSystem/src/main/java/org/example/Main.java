package org.example;


import org.example.Output.AccountReports;
import org.example.data.Account;
import org.example.data.AccountType;
import org.example.data.Customer;
import org.example.logic.AccountService;
import org.example.logic.TransactionService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> nikosAccounts = new ArrayList<>();
        nikosAccounts.add(new Account(14, AccountType.CHECKING, -1000, new ArrayList<>()));
        nikosAccounts.add(new Account(15, AccountType.SAVINGS, 10000, new ArrayList<>()));

        List<Account> milosAccounts = new ArrayList<>();
        milosAccounts.add(new Account(5, AccountType.CHECKING, 100, new ArrayList<>()));
        milosAccounts.add(new Account(6, AccountType.SAVINGS, 18000, new ArrayList<>()));

        List<Account> semasAccounts = new ArrayList<>();
        semasAccounts.add(new Account(27, AccountType.CHECKING, 1200, new ArrayList<>()));

        List<Account> andisAccounts = new ArrayList<>();
        andisAccounts.add(new Account(35, AccountType.CHECKING, 250, new ArrayList<>()));

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Nikola", "Rozic", "Muster-Allee", 108055774, nikosAccounts));
        customers.add(new Customer("Milos", "Jovanovic", "Muster-Allee", 108055774, milosAccounts));
        customers.add(new Customer("Sema", "Wiwi", "Muster-Allee", 108055774, semasAccounts));
        customers.add(new Customer("Andi", "Soso", "Muster-Allee", 108055774, andisAccounts));

        // Filtering accounts by balance.
        AccountService accountService = new AccountService();
        System.out.println(accountService.getAccountWithAmountGreaterThan1(customers, 500));
        System.out.println(accountService.getAccountWithAmountLowerThan1(customers, 500));

        // Enabling transactions.
        TransactionService transactionService = new TransactionService();
        transactionService.transfer(customers, "Nikola", "Milos", 5, LocalDate.now());
        transactionService.transfer(customers, "Nikola", "Sema", 10, LocalDate.now());
        transactionService.transfer(customers, "Nikola", "Andi", 500, LocalDate.now());
        transactionService.transfer(customers, "Nikola", "Andi", 500, LocalDate.of(2023, 11, 30));
        transactionService.transfer(customers, "Nikola", "Andi", 500, LocalDate.of(2024, 01, 01));

        // Test-printing accounts after transactions.
        System.out.println(nikosAccounts);
        System.out.println(milosAccounts);

        // Printing transaction-sum for specific period.
        AccountReports accountReports = new AccountReports();
        accountReports.generateCustomerReport(customers, "Nikola",
                LocalDate.of(2023, 12, 01),
                LocalDate.of(2023, 12, 31));
    }
}
