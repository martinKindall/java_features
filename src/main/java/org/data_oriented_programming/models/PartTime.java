package org.data_oriented_programming.models;

public record PartTime(
        String nombre,
        int horasSemanales,
        boolean esContratoIndefinido,
        long salarioBruto

) implements Empleado {}
