package org.lessons.java.tech;

public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();

        Device playStation = creator.create("playstation", "PlayStation 5");
        Device dvd = creator.create("dvd", "Samsung DVD Player");

        playStation.play();
        playStation.stop();

        dvd.play();
        dvd.stop();
    }
}
