package org.example.logic;

import org.example.data.Customer;

import java.util.Map;

public class BookLending {

    public void lendBook(Map<Integer, Customer> bookMap, int bookID, Customer customer) {
        bookMap.put(bookID, customer);
    }

    public void returnBook(Map<Integer, Customer> bookMap, int bookID) {
        bookMap.remove(bookID);
    }

    public void checkIfBookAvailable(Map<Integer, Customer> bookMap, int bookID) {

        if (bookMap.containsKey(bookID)) {
            System.out.println("Book is already lent!");
        } else {
            System.out.println("Book " + bookID + " is available for lending!");
        }

    }


}
