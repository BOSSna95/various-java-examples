package org.example.data;

public class Customer {

    private String firstName;

    @Override
    public String toString() {
        return "Customer:" +
                "firstName=" + firstName + ", lastName=" + lastName;}

    private String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
