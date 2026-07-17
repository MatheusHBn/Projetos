package ZZZKjunit.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    public void instaceOf_ExecuteChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Javinha");
        if (employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Javinha", developer.getMainLanguage());
        }

        if (employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Javinha", developer.getMainLanguage());
            }
    }
}