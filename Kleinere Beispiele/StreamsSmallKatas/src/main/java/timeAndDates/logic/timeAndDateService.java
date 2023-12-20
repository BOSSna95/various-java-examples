package timeAndDates.logic;

import timeAndDates.data.date;

import java.time.LocalDate;
import java.util.List;

public class timeAndDateService {

    // Wandle eine Liste von Zeiten (in Minuten) in Stunden um.
    public List<Double> convertMinutesToHours (List<Integer> minutes) {
        return minutes.stream()
                .map(minute -> minute.doubleValue() /60).
                toList();
    }

    // Erstelle eine Liste aller Feiertage dieses Jahres.
    public List<date> getHolidays (List<date> dates) {
        return dates.stream().filter(date::isHoliday).toList();
    }


}
