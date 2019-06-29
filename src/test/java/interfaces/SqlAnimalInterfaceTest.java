package interfaces;

import models.Animal;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class SqlAnimalInterfaceTest {
    private Connection conn;
    private SqlAnimalInterface sqlAnimalInterface;

    @Before
    public void setConn() throws Exception{
        String setConnection = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:databases/wildlife.sql'";
        Sql2o sql2o = new Sql2o(setConnection,"","");
        sqlAnimalInterface = new SqlAnimalInterface(sql2o);
        conn = sql2o.open();
    }
    @After
    public void stopConn() throws Exception{
        conn.close();
    }

    @Test
    public void addAnimalAndSetId() throws Exception {
        Animal newAnimal = Animal.setUpAnimal();
        Animal anotherAnimal = Animal.setUpAnimal();
        int initialId = newAnimal.getId();
        sqlAnimalInterface.add(newAnimal);
        sqlAnimalInterface.add(anotherAnimal);
        assertNotEquals(initialId, anotherAnimal.getId());
    }

    @Test
    public void findAnimalByItsId() throws Exception {
        Animal oldAnimal = Animal.setUpAnimal();
        Animal newAnimal = new Animal("Tiger",4);
        sqlAnimalInterface.add(oldAnimal);
        sqlAnimalInterface.add(newAnimal);
        Animal getAnimal = sqlAnimalInterface.findById(newAnimal.getId());
        assertEquals(newAnimal,getAnimal);
    }




}