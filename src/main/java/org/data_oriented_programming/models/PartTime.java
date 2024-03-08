package org.data_oriented_programming.models;

import java.util.Objects;

public record PartTime(
        String nombre,
        int horasSemanales,
        boolean esContratoIndefinido,
        long salarioBruto

) implements Empleado {

    public PartTime {
        Objects.requireNonNull(nombre);

        if (horasSemanales >= 40 || horasSemanales < 25)
            throw new IllegalArgumentException("horas semanales no validas para Part time");
    }

}
