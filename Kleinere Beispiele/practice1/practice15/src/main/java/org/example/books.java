package org.example;

public class books {
 private String title;
 private String author;
 private int pageNumber;


    public books (String title, String author, int pageNumber) {
        this.title = title;
        this.author = author;
        this.pageNumber = pageNumber;
    }

    public String getTitle () {
        return title;
    }

    public String getAuthor () {
        return author;
    }

    public int getPageNumber ()   {
        return pageNumber;
    }
}
