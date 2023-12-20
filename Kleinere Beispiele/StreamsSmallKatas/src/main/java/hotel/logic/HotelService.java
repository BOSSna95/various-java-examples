package hotel.logic;

import hotel.data.Room;

import java.util.List;
import java.util.Optional;

public class HotelService {
    //Suche das erste verfügbare Zimmer in einer Liste von Hotelzimmern.
    public Optional<Room> getFirstAvailableRoom(List<Room> rooms) {
        return rooms.stream()
                .filter(Room::isAvailable)
                .findFirst();
    }
}
