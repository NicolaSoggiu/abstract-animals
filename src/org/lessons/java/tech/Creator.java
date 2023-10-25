package org.lessons.java.tech;

public class Creator {
    public Device create(String type, String name) {
        if ("playstation".equals(type)) {
            return new Playstation(name);
        }
        else if ("dvd".equals(type)) {
            return new DVDPlayer(name);

        }
        return null;
    }
}