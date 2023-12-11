package org.example.data;

import java.util.Date;
import java.util.Objects;

public class Booking {
    private int roomNumber;
    private Date CheckInDate;
    private Date CheckOutDate;
    private final Customer customer;


    public Booking(int roomNumber, Date checkInDate, Date checkOutDate, Customer customer) {
        this.roomNumber = roomNumber;
        this.CheckInDate = checkInDate;
        this.CheckOutDate = checkOutDate;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Booking:" +
                " roomNumber=" + roomNumber +
                ", CheckInDate=" + CheckInDate +
                ", CheckOutDate=" + CheckOutDate +
                ", " + customer.toString()
                ;
    }

    public int getRoomNumber() {return roomNumber;}
    public Date getCheckInDate() {return CheckInDate;}
    public Date getCheckOutDate() {return CheckOutDate;}
    public Customer getCustomer() {return customer;}

    public void setRoomNumber(int roomNumber) {this.roomNumber = roomNumber;}
    public void setCheckInDate(Date checkInDate) {CheckInDate = checkInDate;}
    public void setCheckOutDate(Date checkOutDate) {CheckOutDate = checkOutDate;}
}
