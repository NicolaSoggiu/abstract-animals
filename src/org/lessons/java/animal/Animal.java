package org.lessons.java.animal;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println("Zzz");
    }
    public abstract void noise();

    public abstract void eat();


}
