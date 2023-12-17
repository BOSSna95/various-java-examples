package org.example;

import org.example.data.Book;
import org.example.data.Customer;
import org.example.data.Genre;
import org.example.logic.BookLending;
import org.example.logic.BookService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        /*
    Jedes Buch hat eine eindeutige ID, und es muss nachvollziehbar sein, welcher Benutzer welches Buch ausgeliehen hat.
    Kreiere eine HashMap, die aus einer BuchID als Key und Benutzer als value besteht.
    Entwickle ein System, um zu verfolgen, welche Benutzer welche Bücher ausgeliehen haben,
    und implementiere Funktionen für Ausleihen, Rückgaben und Verfügbarkeitsprüfungen.
 */
        BookService bookService = new BookService();
        BookLending bookLending = new BookLending();

        Book book1 = new Book("James", "Whatever", 124, Genre.Action, true);
        Book book2 = new Book("Anna", "Babumm", 725, Genre.Fantasy, false);
        Book book3 = new Book("JK", "Harry Potter", 875, Genre.Fantasy, true);
        Book book4 = new Book("Tolkin", "LOTR", 16, Genre.Fantasy, true);
        Book book5 = new Book("Anita", "Happy tree", 412, Genre.Romance, true);
        Book book6 = new Book("Jules", "The End", 89, Genre.Action, true);

        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        Customer c1 = new Customer("Peter", "Stiehl");
        Customer c2 = new Customer("Tanja", "Erfried");

        Map<Integer, Customer> bookMap = new HashMap<>();

        bookLending.lendBook(bookMap, 124, c1);
        bookLending.lendBook(bookMap, 16, c2);

        System.out.println(bookMap);
        bookLending.returnBook(bookMap, 124);
        System.out.println(bookMap);
        bookLending.checkIfBookAvailable(bookMap, 124);
        System.out.println(bookMap);


        String bookToBeSearched = "lotr";

        bookService.checkAvailability(bookList, bookToBeSearched);
        bookService.checkAvailability(bookList, Genre.Fantasy);


    }
}