package org.example.data;

public class Customer {

    private final int ID;

    private Gender gender;

    private String firstName;
    private String lastName;

    public Customer(int ID, Gender gender, String firstName, String lastName) {
        this.ID = ID;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public int getID() {
        return ID;
    }

    public Gender getGender() {return gender;}
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setGender(Gender gender) {this.gender = gender;}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "ID=" + ID +
                ", gender=" + gender +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
