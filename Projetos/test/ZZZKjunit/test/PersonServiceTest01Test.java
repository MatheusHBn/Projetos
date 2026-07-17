package ZZZKjunit.test;

import ZZZKjunit.dominio.Person;
import ZZZKjunit.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest01Test {
    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(8);
        personService = new PersonService();
    }
    @Test
    @DisplayName("The person shouldn't adult when age is lower than 18")
    void main_ReturnFalse_WhenAgeIsLowerThan18() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("The person should adult when age is greater or equal than 18")
    void main_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertTrue(personService.isAdult(adult));
    }

    @Test
    @DisplayName("Should throw NullPointerException with message_pt_BR.properties when person is null")
    void main_ShouldThrowException_WhenmPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null), "Person can't be null");
    }

    @Test
    @DisplayName("Should return list with only adult")
    void filterRemovingNotAdult_ShouldReturnListWithAdultOnly_WhenmListOfPersonWitAdultIsPassed() {
        Person person = new Person(12);
        Person person2 = new Person(22);
        Person person3 = new Person(17);
        Person person4 = new Person(21);
        List<Person> personList = List.of(person, person4, person3, person2);
        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList).size());
    }
}