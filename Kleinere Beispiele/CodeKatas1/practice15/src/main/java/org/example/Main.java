package org.example;

public class Main {
    public static void main(String[] args) {

        books firstBook = new books("Herr der Ringe", "whoever", 123);
        books secondBook = new books("Star Wars", "whoever2", 111);

        books[] bookArray = {firstBook, secondBook};


        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getPageNumber() > 100)
                System.out.println("This book has more than 100 pages: " + bookArray[i].getTitle());
        }
    }
}