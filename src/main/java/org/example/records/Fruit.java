package org.example.records;

public sealed interface Fruit permits Mango, Pear, Kiwi {

    static Fruit getRandom() {
        double number = Math.random();

        if (number >= 0.66) return new Mango();
        if (number >= 0.33) return new Pear(12);

        return new Kiwi(5);
    }
}
