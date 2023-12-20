package org.example.Output;

import org.example.data.Customer;

import java.time.LocalDate;
import java.util.List;

public class AccountReports {


    public void generateCustomerReport(List<Customer> customers, String customerName, LocalDate startDate, LocalDate endDate) {
        final int[] transactionSum = {0};
        customers.stream().filter(customer -> customer.firstName().equalsIgnoreCase(customerName)).
                flatMap(n -> n.accounts().stream()).
                flatMap(n -> n.getTransactions().stream()).
                forEach(n -> {if (n.date().isAfter(startDate) && n.date().isBefore(endDate)) {transactionSum[0] += n.amount();}});
        System.out.println(transactionSum[0]);
    }
}
