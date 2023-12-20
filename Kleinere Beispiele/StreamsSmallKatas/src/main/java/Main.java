import adults.data.Person;
import adults.logic.AdultService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AdultService adultService = new AdultService();
        Person p1 = new Person("Fritz", 22);
        Person p2 = new Person("Peter", 22);
        Person p3 = new Person("Fritz", 34);

        List<Person> persons = new ArrayList<>(List.of(p1));

        System.out.println(adultService.countAmountOfEachName(persons));

        List<String> names = new ArrayList<>(List.of("Paul", "Tanja", "Paul", "Paul"));

        System.out.println(adultService.getCustomerAndCount(names));
    }
}
