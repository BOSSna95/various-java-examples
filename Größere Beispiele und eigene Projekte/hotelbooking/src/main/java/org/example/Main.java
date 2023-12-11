package org.example;

import org.example.data.Booking;
import org.example.data.Customer;
import org.example.data.Gender;
import org.example.data.Room;
import org.example.logic.BookingService;
import org.example.logic.RoomAvailability;
import org.example.output.PrintBookings;


import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Erstelle eine Anwendung, die Hotelbuchungen  speichert und Funktionen wie die Überprüfung der Verfügbarkeit
        // von Zimmern und die Historie von Gästeaufenthalten zeigt.

        RoomAvailability roomAvailability = new RoomAvailability();
        BookingService bookingService = new BookingService();
        PrintBookings printBookings = new PrintBookings();

        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        rooms.add(new Room(1));
        rooms.add(new Room(2));
        rooms.add(new Room(3));
        rooms.add(new Room(4));
        rooms.add(new Room(5));
        rooms.add(new Room(6));
        rooms.add(new Room(7));
        rooms.add(new Room(8));
        rooms.add(new Room(9));
        rooms.add(new Room(10));

        customers.add(new Customer(158, Gender.MALE, "James", "Smith"));
        customers.add(new Customer(796, Gender.FEMALE, "Carrie", "Johnsan"));
        customers.add(new Customer(67, Gender.DIVERS, "John", "Krüger"));

        //Booking 1
        bookingService.Booking(7,
                new Date(2024, 0, 15),
                new Date(2024, 0, 18),
                796,
                bookings,
                customers,
                rooms,
                roomAvailability);

        //Booking 2
        bookingService.Booking(5,
                new Date(2024, 0, 15),
                new Date(2024, 0, 19),
                158,
                bookings,
                customers,
                rooms,
                roomAvailability);

        //Booking 3
        bookingService.Booking(2,
                new Date(2024, 0, 15),
                new Date(2024, 0, 20),
                67,
                bookings,
                customers,
                rooms,
                roomAvailability);

        //Trying to double book
        bookingService.Booking(2,
                new Date(2024, 0, 16),
                new Date(2024, 0, 19),
                67,
                bookings,
                customers,
                rooms,
                roomAvailability);

        printBookings.allBookings(bookings);
        System.out.println("----------------------------");
        printBookings.customerBookingsByID(bookings, 67);
        System.out.println("----------------------------");

        printBookings.customerBookingsByLastname(bookings, "Smith");

    }
}