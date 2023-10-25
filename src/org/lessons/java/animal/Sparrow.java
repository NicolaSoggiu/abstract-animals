package org.lessons.java.animal;

public class Sparrow extends Animal implements CanFly {

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

    @Override
    public void fly() {
        System.out.println("I'm a sparrow and I'm flying");
    }
}
