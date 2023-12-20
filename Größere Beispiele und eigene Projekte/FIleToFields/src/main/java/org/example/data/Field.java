package org.example.data;

public class Field {

    String ID;
    String name;
    String price;
    String pricePerHouse;
    String baseRent;
    String rentWithOneHouse;

    public String getID() {return ID;}
    public void setID(String ID) {this.ID = ID;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
    public String getPricePerHouse() {return pricePerHouse;}
    public void setPricePerHouse(String pricePerHouse) {this.pricePerHouse = pricePerHouse;}
    public String getBaseRent() {return baseRent;}
    public void setBaseRent(String baseRent) {this.baseRent = baseRent;}
    public String getRentWithOneHouse() {return rentWithOneHouse;}
    public void setRentWithOneHouse(String rentWithOneHouse) {this.rentWithOneHouse = rentWithOneHouse;}


    public Field(String ID, String name, String price, String pricePerHouse, String baseRent, String rentWithOneHouse) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.pricePerHouse = pricePerHouse;
        this.baseRent = baseRent;
        this.rentWithOneHouse = rentWithOneHouse;
    }

    @Override
    public String toString() {
        return "Field{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", pricePerHouse='" + pricePerHouse + '\'' +
                ", baseRent='" + baseRent + '\'' +
                ", rentWithOneHouse='" + rentWithOneHouse + '\'' +
                '}';
    }
}



