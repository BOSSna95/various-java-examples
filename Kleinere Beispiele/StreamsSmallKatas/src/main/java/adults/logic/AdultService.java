package adults.logic;

import adults.data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class AdultService {

    //Filtere alle Erwachsenen aus einer Liste von Personen.
    public List<Person> getAdults(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.age() >= 18)
                .toList();
    }

    // Berechne den Durchschnittsalter einer Gruppe von Personen.
    public OptionalDouble getAverageAge(List<Person> persons) {
        return persons.stream()
                .mapToDouble(Person::age)
                .average();
    }

    // Wandle eine Liste von Kundennamen in eine Map um, die zählt, wie oft jeder Name vorkommt.
    public Map<String, Long> countAmountOfEachName(List<Person> persons) {
        return persons.stream().map(Person::name).collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));

    }

    public Map<String, Long> getCustomerAndCount(List<String> customerNames) {
        return customerNames.stream()
                .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
    }


}
