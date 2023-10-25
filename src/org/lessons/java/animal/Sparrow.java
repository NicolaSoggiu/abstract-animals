package org.lessons.java.animal;

public class Sparrow extends Animal {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println("Cip Cip");
    }

    @Override
    public void eat() {
        System.out.println("Seeds");
    }
}
