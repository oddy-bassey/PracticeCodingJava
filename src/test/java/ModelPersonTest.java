import static org.junit.jupiter.api.Assertions.assertEquals;

import model_a_person.Person;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ModelPersonTest {

    @Test
    public void personAttributes_firstName(){

        Person person = new Person("Adamu", "Richards", 23);
        assertEquals("Adamu", person.getFirstName());

        person.setFirstName("Adam");
        assertEquals("Adam", person.getFirstName());
    }

    @Test
    public void personAttributes_lastName(){

        Person person = new Person("Michael", "Engrin", 27);
        assertEquals("Engrin", person.getLastName());

        person.setLastName("Osus");
        assertEquals("Osus", person.getLastName());
    }

    @Test
    public void personAttributes_age(){

        Person person = new Person("Gabriel", "Osub", 24);
        assertEquals(24, person.getAge());

        person.setAge(27);
        assertEquals(27, person.getAge());
    }

    @Test
    public void personAttributes_invalidAge(){

        Person person = new Person("Gabriel", "Osub", 24);
        assertEquals(24, person.getAge());

        person.setAge(20);
        assertEquals(24, person.getAge());
    }

    @Test
    public void personAttributes_introduceYourself(){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Person person = new Person("Gabriel", "Osub", 24);
        person.introduceYourself();
        assertEquals("Hi, my name is Osub Gabriel and I'm 24 years old\r\n", outputStream.toString());

        System.setOut(System.out);
    }
}
