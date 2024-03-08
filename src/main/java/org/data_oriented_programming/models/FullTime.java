package org.data_oriented_programming.models;

public record FullTime(
        String nombre,
        boolean esContratoIndefinido,
        long salarioBruto,
        String previsionSalud
) implements Empleado {

    public int horasSemanales() {
        return 40;
    }
}
