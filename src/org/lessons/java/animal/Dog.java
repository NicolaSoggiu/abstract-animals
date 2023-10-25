package org.lessons.java.animal;

public class Dog extends Animal implements CanSwim {

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

    @Override
    public void swim() {
        System.out.println("I'm a dog and I'm swimming");
    }
}
