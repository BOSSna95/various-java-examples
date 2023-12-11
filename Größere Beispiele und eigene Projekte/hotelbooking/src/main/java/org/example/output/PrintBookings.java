package org.example.output;

import org.example.data.Booking;

import java.util.ArrayList;

public class PrintBookings {

    public void allBookings(ArrayList<Booking> bookings) {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }

    public void customerBookingsByID(ArrayList<Booking> bookings, int ID) {
        System.out.println("Here are the bookings for the customer with ID: " + ID);
        int NumberOFBookings = 0;
        for (Booking booking : bookings) {
            if (booking.getCustomer().getID() == ID){
                System.out.println(booking);
                NumberOFBookings++;

        }} if (NumberOFBookings==0) {
            System.out.println("Right know there are no bookings from customer with ID " + ID + "!");

        }
    }

    public void customerBookingsByLastname(ArrayList<Booking> bookings, String lastName) {
        System.out.println("Here are the bookings for: " + lastName);
        int NumberOFBookings = 0;
        for (Booking booking : bookings) {
            if (booking.getCustomer().getLastName().equalsIgnoreCase(lastName))
                System.out.println(booking);
            NumberOFBookings++;
        } if (NumberOFBookings==0) {
            System.out.println("Right know there are no bookings from " + lastName + "!");

        }
    }


}
