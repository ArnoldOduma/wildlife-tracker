package interfaces;

import models.Animal;

import java.util.List;

public interface AnimalInterface {
     void saveAnimal(Animal animal);

    List<Animal> getAll();

    Animal findById(int id);
}
