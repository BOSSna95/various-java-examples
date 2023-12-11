package org.example.logic;

import org.example.data.Booking;
import org.example.data.Room;

import java.util.ArrayList;
import java.util.Date;

public class RoomAvailability {

    public boolean checkIfRoomAvailable(ArrayList<Booking> bookings, Date requestedCheckInDate,
                                        Date requestedCheckOutDate, int roomNumber) {

        for (Booking booking : bookings) {
            if (booking.getRoomNumber() == roomNumber) {
                if (booking.getCheckInDate().after(requestedCheckInDate) && booking.getCheckInDate().before(requestedCheckOutDate) ||
                        booking.getCheckOutDate().after(requestedCheckInDate) && booking.getCheckInDate().before(requestedCheckOutDate)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkIfRoomExists(ArrayList<Room> rooms, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return true;
            }
        }
        return false;
    }
}