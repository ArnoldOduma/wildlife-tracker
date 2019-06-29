package models;

import java.util.ArrayList;
import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private int id;
    private static ArrayList<Animal> allAnimals = new ArrayList<>();

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
        allAnimals.add(this);
        this.id = 1;
    }

    public static Animal setUpAnimal(){return new Animal("Rhino",5);}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAge() == animal.getAge() &&
                getId() == animal.getId() &&
                getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getId());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList<Animal> getAllAnimals() {
        return allAnimals;
    }

    public static void setAllAnimals(ArrayList<Animal> animals) {
        Animal.allAnimals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void clearAll(){
        Animal.allAnimals.clear();
    }

}
