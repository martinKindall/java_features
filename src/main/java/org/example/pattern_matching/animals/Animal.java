package org.example.pattern_matching.animals;

public enum Animal {
    TIGER,
    SNAKE;

    public static Animal getRandom() {
        double rand = Math.random();

        return rand >= 0.5 ? TIGER : SNAKE;
    }
}
