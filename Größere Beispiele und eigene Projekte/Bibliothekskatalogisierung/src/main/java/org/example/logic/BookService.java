package org.example.logic;

import org.example.data.Book;
import org.example.data.Genre;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    // add a List to safe the found books to. Implement print-method to loop through found books and print them.

/*    public void checkIfPartOfLibrary(List<Book> bookList, String title) {
        if (checkIfBookExists(bookList, title)) {
            System.out.printf("The book %s is part of the library.", title);
        } else {
            System.out.printf("The book %s is not part of the library.", title);
        }
    }    */

    public void checkAvailability(List<Book> bookList, String title) {
        List<Book> filteredBooks = filterBooks(bookList, title);
        if (filteredBooks.isEmpty()) {
            System.out.println("No book with the title: '" + title + "' was found.");
            System.out.print("-------------------------------");
        }
        for (Book book : filteredBooks) {
            if (book.getAvailability()) {
                System.out.printf("Book '%s' is available!", book);
                System.out.println();
                System.out.print("-------------------------------");
            } else {
                System.out.printf("Book '%s' is not available!", book);
                System.out.println();
                System.out.print("-------------------------------");
            }
        }

    }

    public void checkAvailability(List<Book> bookList, Genre genre) {
        System.out.println();
        System.out.println("Here is the availability for the books of the genre " + genre + ":");
        for (Book book : filterBooks(bookList, genre)) {
            if (book.getAvailability()) {
                System.out.printf("Book '%s' is available!", book);
                System.out.println();
            } else {
                System.out.printf("Book '%s' is not available!", book);
                System.out.println();
            }
        }
    }

    public List<Book> filterBooks(List<Book> bookList, String title) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getTitel().equalsIgnoreCase(title)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }

    public List<Book> filterBooks(List<Book> bookList, Genre genre) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getGenre().equals(genre)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;
    }


}