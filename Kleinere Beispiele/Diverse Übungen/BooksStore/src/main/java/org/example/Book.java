package org.example;

public class Book {

    private String title;

    private String author;

    private double price;

    private int discount;

    public Book(String title, String author, double price, int discount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.discount = discount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}
