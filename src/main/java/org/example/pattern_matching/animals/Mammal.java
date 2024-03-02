package org.example.pattern_matching.animals;

public interface Mammal {

    boolean canFly();

    public static Mammal getRandom() {
        double rand = Math.random();

        return rand >= 0.5 ? new Bat() : new Elephant();
    }
}
