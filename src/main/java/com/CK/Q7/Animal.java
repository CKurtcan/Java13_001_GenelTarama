package com.CK.Q7;

public abstract class Animal {

    protected String name;
    protected String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println(name + " - " + species);
    }

}
