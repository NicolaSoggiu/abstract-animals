package org.lessons.java.animal;

public class Dolphin extends Animal implements CanSwim {

    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void noise() {
        System.out.println("Sqqqq");
    }

    @Override
    public void eat() {
        System.out.println("Fish");
    }

    @Override
    public void swim() {
        System.out.println("I'm a dolphin and I'm swimming");
    }
}
