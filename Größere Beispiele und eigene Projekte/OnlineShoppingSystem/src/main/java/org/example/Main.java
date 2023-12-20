package org.example;

import org.example.data.Customer;
import org.example.data.Product;
import org.example.logic.SearchService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("1453", "Orange", 2.50));
        products.add(new Product("1623", "Apple", 2.25));
        products.add(new Product("5162", "Cherry", 0.33));
        products.add(new Product("0375", "Mango", 5));

        SearchService searchService = new SearchService();

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Fritz", "MusterAllee", "bla@hi.com", new ArrayList<>()));
        customers.add(new Customer("Paul", "MusterStrasse", "blub@hi.com", new ArrayList<>()));




        System.out.println(searchService.getProductsCheaperThan(products, 0));


    }
}
