package com.CK.Q7;

public class Zoo {
    private Animal[] animals;
    private int animalCount;

    public Zoo() {
        this.animals = new Animal[0];
        this.animalCount = 0;
    }

    public void addAnimal(Animal animal) {
        Animal[] newAnimals = new Animal[animals.length + 1];
        System.arraycopy(animals, 0, newAnimals, 0, animals.length);
        newAnimals[animals.length] = animal;
        animals = newAnimals;
        animalCount++;
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void displayAllInfo() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }
}
