package org.lessons.java.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println("Bau bau");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }
}
