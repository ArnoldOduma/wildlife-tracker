package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import interfaces.*;

import java.util.List;

import static org.junit.Assert.*;

public class SightingTest {

    @Test
    public void getId() {
    }


    @Test
    public void getAnimal_id() {
    }

    @Test
    public void setAnimal_id() {
    }

    @Test
    public void getAnimal_location() {
    }


    @Test
    public void equals1() {
    }

    @Test
    public void hashCode1() {
    }

    @Test
    public void saveSightedAnimal() {
        Sighting newSighting = Sighting.setUpSighting();
        Sighting another = new Sighting(23,"test","Arnold");
        int initialId = newSighting.getId();
        newSighting.saveSightedAnimal(newSighting);
        another.saveSightedAnimal(another);
        assertEquals(initialId,another.getId());
    }
    @Before
    public void setConn() throws Exception{

    }
    @After
    public void stopConn() throws Exception{

    }

    @Test
    public void findAnimalById() {
        Sighting oldSighting = Sighting.setUpSighting();
        oldSighting.saveSightedAnimal(oldSighting);
        assertEquals(oldSighting, oldSighting.findAnimalById(oldSighting.getId()));
    }

    @Test
    public void allSightings() throws Exception{
        Sighting oldSighting = Sighting.setUpSighting();
        oldSighting.saveSightedAnimal(oldSighting);
        assertTrue( Sighting.allSightings().contains(oldSighting));
    }


    public Sighting setUpSighting() {
        return new Sighting(1, "Zone-A", "Cliff");
    }
}