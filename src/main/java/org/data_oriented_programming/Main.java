package org.data_oriented_programming;

import org.data_oriented_programming.models.Empleado;
import org.data_oriented_programming.models.FullTime;
import org.data_oriented_programming.models.PartTime;

import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Empleado john = new FullTime("John", true, 5000,
                "Banmedica");

        Empleado foo = new PartTime("Foo", 25, false, 2000);

        mostrarSueldos(List.of(john, foo));
    }

    static void mostrarSueldos(Collection<Empleado> empleados) {

        for (Empleado empleado: empleados) {

            String resumen = switch (empleado) {

                case FullTime(String nombre, boolean esContratoIndef,
                              long salarioBruto, String previsionSalud) ->
                        "El sueldo liquido de " + nombre + " es: " + Math.round(salarioBruto * 0.85);

                case PartTime(String nombre, int horasSemanales, boolean esContratoIndef,
                              long salarioBruto) ->
                        "El sueldo liquido de " + nombre + " es: " + Math.round(salarioBruto * 0.9);
            };

            System.out.println(resumen);
        }
    }
}
