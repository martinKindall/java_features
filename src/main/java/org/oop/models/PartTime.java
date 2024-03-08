package org.oop.models;

import lombok.Builder;
import org.oop.interfaces.Empleado;

import java.util.Objects;

@Builder
public class PartTime implements Empleado {

    private final String nombre;
    private final int horasSemanales;
    private final boolean esContratoIndefinido;
    private final long salarioBruto;

    public PartTime(String nombre, int horasSemanales, boolean esContratoIndefinido, long salarioBruto) {
        Objects.requireNonNull(nombre);

        this.nombre = nombre;
        if (horasSemanales >= 40 || horasSemanales < 20)
            throw new IllegalArgumentException("Horas semanales no permitidas para Part time");

        this.horasSemanales = horasSemanales;
        this.esContratoIndefinido = esContratoIndefinido;
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int horasSemanales() {
        return horasSemanales;
    }

    @Override
    public boolean contratoIndefinido() {
        return esContratoIndefinido;
    }

    @Override
    public long salarioLiquido() {
        return Math.round(salarioBruto * 0.9);
    }
}
