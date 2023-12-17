package org.example.logic;

import org.example.data.Book;

import java.util.List;

public class BookInfo {

    public void checkIfPartOfLibrary(List<Book> bookList, String title) {
        if (checkIfBookExists(bookList, title)) {
            System.out.printf("The book %s is part of the library.", title);
        } else {
            System.out.printf("The book %s is not part of the library.", title);
        }
    }

    public void checkAvailability(List<Book> bookList, String title) {
        boolean bookAvailable=true;
        for (Book book : bookList) {
            if (checkIfBookExists(bookList, title)) {
                bookAvailable = book.getAvailability();
            }
        }
        if (bookAvailable) {
            System.out.printf("Book '%s' is available!", title);
        } else  {
            System.out.printf("Book '%s' is not available!", title);
        }
    }


    public boolean checkIfBookExists(List<Book> bookList, String title) {
        for (Book book : bookList) {
            if (book.getTitel().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}