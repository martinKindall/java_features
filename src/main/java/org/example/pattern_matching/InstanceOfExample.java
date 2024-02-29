package org.example.pattern_matching;

import lombok.extern.slf4j.Slf4j;
import org.example.interfaces.Employee;

@Slf4j
public class InstanceOfExample {

    public static void main(String[] args) {
        org.apache.log4j.BasicConfigurator.configure();

        Employee employee = new Freelancer(1L, "John Doe");

        if (employee instanceof Freelancer freelancer) {
            log.info(freelancer.contract());
        }
    }
}
