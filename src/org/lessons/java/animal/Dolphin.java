package org.lessons.java.animal;

public class Dolphin extends Animal {

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
}
