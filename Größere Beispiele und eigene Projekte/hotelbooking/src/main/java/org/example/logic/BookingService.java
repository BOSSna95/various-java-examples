package org.example.logic;

import org.example.data.Booking;
import org.example.data.Customer;
import org.example.data.Room;

import java.util.ArrayList;
import java.util.Date;

public class BookingService {
    public void Booking(int roomNumber, Date checkInDate, Date checkOutDate, int ID, ArrayList<Booking> bookings,
                        ArrayList<Customer> customers, ArrayList<Room> rooms, RoomAvailability roomAvailability) {

        if (!roomAvailability.checkIfRoomAvailable(bookings, checkInDate, checkOutDate, roomNumber)) {
            System.out.printf("Room %s is not available for the requested period!", roomNumber);
            System.out.println();
            return;
        } else if (!roomAvailability.checkIfRoomExists(rooms, roomNumber)) {
            System.out.printf("No room with number %s found!", roomNumber);
            System.out.println();
            return;
        }

        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                for (Customer customer : customers) {
                    if (ID == customer.getID()) {
                        bookings.add(new Booking(roomNumber, checkInDate, checkOutDate, customer));
                        System.out.printf("Room %s successfully booked from %s to %s", roomNumber, checkInDate, checkOutDate);
                        System.out.println();
                        return;
                    }
                }
            }
        }
        System.out.println("No customer with ID " + ID + " found! Create new customer?");
    }
}
