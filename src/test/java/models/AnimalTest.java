package models;

import org.junit.*;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class AnimalTest {

    public Animal setUpAnimal(){return new Animal("Rhino",5);}

    @Test
    public void getAge() {
        Animal newAnimal = setUpAnimal();
        assertEquals(5,newAnimal.getAge());
    }

    @Test
    public void setAge() {
        Animal newAnimal = setUpAnimal();
        newAnimal.setAge(10);
        assertEquals(10,newAnimal.getAge());
    }

    @Test
    public void getId() {
        Animal.clearAll();
        Animal newAnimal = setUpAnimal();
        assertEquals(1,newAnimal.getId());
    }

    @Test
    public void setId() {
        Animal newAnimal = setUpAnimal();
        newAnimal.setId(3);
        assertEquals(3,newAnimal.getId());
    }

    @Test
    public void getAllAnimals() {
        Animal.clearAll();
        Animal newAnimal = setUpAnimal();
        Animal anotherAnimal = setUpAnimal();
        assertEquals(2,Animal.getAllAnimals().size());
    }

    @Test
    public void getName() {
        Animal newAnimal = setUpAnimal();
        assertEquals("Rhino",newAnimal.getName());
    }

    @Test
    public void setName() {
        Animal newAnimal = setUpAnimal();
        newAnimal.setName("Hyena");
        assertEquals("Hyena",newAnimal.getName());
    }
}