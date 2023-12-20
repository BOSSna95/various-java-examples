package city.logic;

import city.data.City;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CityService {
    //Sortiere eine Liste von Städten nach ihrer Einwohnerzahl.
    public List<City> getCitySortedByAmount(List<City> cities) {
//        cities.sort(Comparator.comparingInt(City::numberOfCitizens));
//        return cities;
        return cities.stream()
                .sorted(Comparator.comparingInt(City::numberOfCitizens))
                .toList();
    }
}
