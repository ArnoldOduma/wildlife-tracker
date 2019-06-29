package interfaces;

import models.Animal;

import java.util.List;

public interface AnimalInterface {
    void add(Animal animal);

    List<Animal> getAll();

    //find a specific animal
    Animal findById(int id);
}
