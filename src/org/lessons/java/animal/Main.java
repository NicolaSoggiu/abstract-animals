package org.lessons.java.animal;

public class Main {
    public static void main(String[] args) {

        Dog rex = new Dog("Rex");
        rex.eat();
        rex.noise();
        rex.sleep();
        Dolphin flipper = new Dolphin("Flipper");
        flipper.eat();
        flipper.noise();
        flipper.sleep();
        Eagle bruce = new Eagle("Bruce");
        bruce.eat();
        bruce.noise();
        bruce.sleep();
        Sparrow mike = new Sparrow("Mike");
        mike.eat();
        mike.noise();
        mike.sleep();
    }
}
