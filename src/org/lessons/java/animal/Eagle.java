package org.lessons.java.animal;

public class Eagle extends Animal {

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
}
