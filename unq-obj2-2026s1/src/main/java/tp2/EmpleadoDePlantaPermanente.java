package tp2;

import lombok.Getter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
public class EmpleadoDePlantaPermanente extends Empleado{
    private int cantHijos;
    private int antiguedad;

    EmpleadoDePlantaPermanente(
            String nombre,
            String direccion,
            String estadoCivil,
            double sueldoBasico,
            LocalDate fechaNacimiento,
            int cantHijos,
            int antiguedad
    ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = sueldoBasico;
        this.fechaNacimiento = fechaNacimiento;
        this.cantHijos = cantHijos;
        this.antiguedad = antiguedad;
    }

    @Override
    public double getSueldoBruto(){
        return sueldoBasico +
                150*cantHijos +
                getAsignacionPorConyuge() +
                50*antiguedad;
    }

    private double getAsignacionPorConyuge() {
        return Objects.equals(estadoCivil, "Casado") ? 100 : 0;
    }

    @Override
    public double getRetenciones(){
        return getSueldoBruto() *0.1 + 20*cantHijos + getAportesJubilatorios();
    }

    private double getAportesJubilatorios() {
        return getSueldoBruto() * 0.15;
    }
}

