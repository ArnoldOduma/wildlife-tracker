package models;

import org.junit.*;
import static org.junit.Assert.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AnimalTest {


    @Test
    public void getAnimal_age() {
        Animal newAnimal = Animal.setUpNewAnimal();
        assertEquals("Old",newAnimal.getAnimal_age());
    }

    @Test
    public void setanimal_age() {
        Animal newAnimal = Animal.setUpNewAnimal();
        newAnimal.setAnimal_age("Young");
        assertEquals("Young",newAnimal.getAnimal_age());
    }


    @Test
    public void setId() {
        Animal newAnimal = Animal.setUpNewAnimal();
        newAnimal.setId(3);
        assertEquals(3,newAnimal.getId());
    }

    @Test
    public void getName() {
        Animal newAnimal = Animal.setUpNewAnimal();
        assertEquals("Cat",newAnimal.getAnimal_name());
    }

    @Test
    public void setName() {
        Animal newAnimal = Animal.setUpNewAnimal();
        newAnimal.setAnimal_name("Hyena");
        assertEquals("Hyena",newAnimal.getAnimal_name());
    }

    @Test
    public void equals1() {
    }

    @Test
    public void hashCode1() {
    }

    @Test
    public void saveAnimal() {
        Animal newAnimal = Animal.setUpNewAnimal();
        int initialId = newAnimal.getId();
        newAnimal.saveAnimal(newAnimal);
        assertNotEquals(initialId,newAnimal.getId());
    }
}