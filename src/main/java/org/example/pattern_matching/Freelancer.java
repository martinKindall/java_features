package org.example.pattern_matching;

import org.example.interfaces.Employee;


public record Freelancer(Long uid, String name) implements Employee {

    @Override
    public Long uid() {
        return uid;
    }

    @Override
    public String name() {
        return name;
    }

    public String contract() {
        return "This is a contract";
    }
}
