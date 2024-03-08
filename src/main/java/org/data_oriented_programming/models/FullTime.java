package org.data_oriented_programming.models;

import java.util.Objects;

public record FullTime(
        String nombre,
        boolean esContratoIndefinido,
        long salarioBruto,
        String previsionSalud
) implements Empleado {

    public FullTime {
        Objects.requireNonNull(nombre);
    }

    public int horasSemanales() {
        return 40;
    }
}
