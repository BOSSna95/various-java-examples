package adults.logic;

import adults.data.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AdultServiceTest {

    @Test
    void getAdults() {
        //Tripple "A" pattern:
        //Arrange
        Person p1 = new Person("Niko", 20);
        Person p2 = new Person("Emad", 5);
        Person p3 = new Person("Andi", 4);
        List<Person> persons = List.of(p1, p2, p3);
        //Act
        AdultService adultService = new AdultService();
        List<Person> adults = adultService.getAdults(persons);
        //Assert
        assertEquals(List.of(p1), adults);
    }

    @Test
    void getAverageAge() {
    }
}