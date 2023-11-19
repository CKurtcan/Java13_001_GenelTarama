package com.CK.Q7;

public class Aquarium extends Animal{
    private String waterType;

    public Aquarium(String name, String species, String waterType) {
        super(name, species);
        this.waterType = waterType;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " doesn't make much sound in the water.");
    }

    public void swim() {
        System.out.println(name + " is swimming in the water.");
    }
}
