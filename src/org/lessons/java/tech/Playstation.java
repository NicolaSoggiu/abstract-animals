package org.lessons.java.tech;

public class Playstation extends Creator implements Device{
    private String name;

    public Playstation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("I'm a" + name + " " + "and I'm in play!");
    }

    @Override
    public void stop() {
        System.out.println("I'm a" + name + " " + "and I'm in stop!");
    }
}
