package org.example;

import org.example.data.Book;
import org.example.data.Genre;
import org.example.logic.BookInfo;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("James", "Whatever", 124, Genre.Action, true);
        Book book2 = new Book("Anna", "Babumm", 725, Genre.Romance, true);
        Book book3 = new Book("JK", "Harry Potter", 875, Genre.Fantasy, true);
        Book book4 = new Book("Tolkin", "LOTR", 16, Genre.Fantasy, true);
        Book book5 = new Book("Anita", "Happy tree", 412, Genre.Romance, true);
        Book book6 = new Book("Jules", "End", 89, Genre.Action, true);

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        BookInfo bookService = new BookInfo();

        String bookToBeSearched = "lotr";

        bookService.checkIfPartOfLibrary(bookList, bookToBeSearched);
        System.out.println();
        bookService.checkAvailability(bookList, bookToBeSearched);



    }
}