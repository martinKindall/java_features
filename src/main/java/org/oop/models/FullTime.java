package org.oop.models;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.oop.interfaces.Empleado;

@Builder
@RequiredArgsConstructor
public class FullTime implements Empleado {

    @NonNull
    private final String nombre;
    private final boolean esContratoIndefinido;
    private final long salarioBruto;
    @NonNull
    private final String previsionSalud;

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int horasSemanales() {
        return 40;
    }

    @Override
    public boolean contratoIndefinido() {
        return esContratoIndefinido;
    }

    @Override
    public long salarioLiquido() {
        return Math.round(salarioBruto * 0.85);
    }

    public String previsionSalud() {
        return previsionSalud;
    }
}
