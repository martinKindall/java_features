package org.example.pattern_matching;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.Employee;
import org.example.pattern_matching.animals.Animal;
import org.example.pattern_matching.animals.Bat;
import org.example.pattern_matching.animals.Elephant;
import org.example.pattern_matching.animals.Mammal;

@Slf4j
public class InstanceOfExample {

    public static void main(String[] args) {
        org.apache.log4j.BasicConfigurator.configure();

        Employee employee = new Freelancer(1L, "John Doe");

        if (employee instanceof Freelancer freelancer) {
            log.info(freelancer.contract());
        }

        // Here, the default case is not enforced
        // Hence, it's less secure: in case we add a new Enum type, the code will be silent about it
        Animal randAnimal = Animal.getRandom();
        switch (randAnimal) {
            //case SNAKE -> log.info("Run!");
            case TIGER -> log.info("A big cat");
            //default -> throw new IllegalArgumentException(randAnimal + " does not exist");
        }

        // here the default case is mandatory, else we get compile error
        Mammal randMammal = Mammal.getRandom();
        switch (randMammal) {
            case Bat bat -> log.info("A flying mouse");
            case Elephant elephant -> log.info("Quite a big animal");
            default -> throw new IllegalArgumentException(randMammal + " does not exist");
        }
    }
}
