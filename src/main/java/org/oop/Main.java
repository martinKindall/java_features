package org.oop;

import org.oop.interfaces.Empleado;
import org.oop.models.FullTime;
import org.oop.models.PartTime;

import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empleado john = FullTime.builder()
                .nombre("John")
                .esContratoIndefinido(true)
                .salarioBruto(5000)
                .previsionSalud("Banmedica")
                .build();

        Empleado foo = PartTime.builder()
                .nombre("Foo")
                .horasSemanales(25)
                .esContratoIndefinido(false)
                .salarioBruto(2000)
                .build();

        mostrarSueldos(List.of(john, foo));
    }

    static void mostrarSueldos(Collection<Empleado> empleados) {

        for (Empleado empleado: empleados) {
            System.out.println("El sueldo liquido de " + empleado.nombre() + " es: " +
                    empleado.salarioLiquido());
        }
    }
}
