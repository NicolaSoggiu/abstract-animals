package org.lessons.java.animal;

public class Eagle extends Animal implements CanFly {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println("Grrrr");
    }

    @Override
    public void eat() {
        System.out.println("Animals");
    }

    @Override
    public void fly() {
        System.out.println("I'm a eagle and I'm flying");
    }
}
