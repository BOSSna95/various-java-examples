package org.example.data;

public class Book {

    final String author;

    final String titel;

    final int bookID;

    final Genre genre;

    boolean availability;


    public String getAuthor() {
        return author;
    }

    public String getTitel() {
        return titel;
    }
    public int getBookID() {
        return bookID;
    }
    public Genre getGenre() {
        return genre;
    }
    public boolean getAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public Book(String author, String titel, int bookID, Genre genre, boolean availability) {
        this.author = author;
        this.titel = titel;
        this.bookID = bookID;
        this.genre = genre;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return titel + " by " + author;
    }
}
