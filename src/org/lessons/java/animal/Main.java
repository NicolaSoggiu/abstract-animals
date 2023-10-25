package org.lessons.java.animal;

public class Main {
    public static void main(String[] args) {

        // STEP 1
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

        // STEP 2
        Animal[] animals = {rex, flipper, bruce, mike};
        for (Animal animal : animals) {
            if (animal instanceof CanSwim) {
                swimming((CanSwim) animal);
            } else if (animal instanceof CanFly) {
                flying((CanFly) animal);
            }
        }

    }

    public static void swimming(CanSwim animal) {
        animal.swim();
    }
    public static void flying(CanFly animal) {
        animal.fly();
    }
}
