package tp2;

import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Getter
abstract public class Empleado {
    String nombre;
    String direccion;
    String estadoCivil;
    double sueldoBasico;
    LocalDate fechaNacimiento;

    public int getEdad(){
        return Period.between(LocalDate.now(), fechaNacimiento).getYears();
    }

    public double getSueldoNeto() {
        return getSueldoBruto()-getRetenciones();
    }

    abstract double getSueldoBruto(); //subclass responsability

    abstract double getRetenciones();
}
