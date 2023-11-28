package org.example;

public class Equipment {

    private String name;
    private int price;

    private String manufacturer;

    private int popularity; //must be between 1 and 5

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public Equipment (String name, int price, String manufacturer, int popularity) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.popularity = popularity;


    }


}
