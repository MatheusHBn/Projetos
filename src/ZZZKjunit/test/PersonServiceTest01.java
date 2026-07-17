package ZZZKjunit.test;

import ZZZKjunit.dominio.Person;
import ZZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    static void main() {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is adult? '{}'", personService.isAdult(person));
    }
}
