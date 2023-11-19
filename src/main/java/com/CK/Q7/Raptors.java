package com.CK.Q7;

public class Raptors extends Animal{

    private String type;

    public Raptors(String name, String species, String type) {
        super(name, species);
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a fierce sound!");
    }

    public void hunt() {
        System.out.println(name + " is hunting for prey.");
    }

}
