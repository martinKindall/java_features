package org.example.pattern_matching;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;
import org.example.records.Fruit;
import org.example.records.Kiwi;
import org.example.records.Mango;
import org.example.records.Pear;


@Slf4j
public class RecordMatching {

    public static void main(String[] args) {
        BasicConfigurator.configure();

        Fruit fruit = Fruit.getRandom();

        switch (fruit) {
            case Pear(int sugar) -> log.info("This fruit has {} amount of sugar", sugar);
            case Kiwi(int acidity) -> log.info("This fruit has {} amount of acidity", acidity);
            case Mango() -> log.info("This fruit is healthy");
        }
    }
}
