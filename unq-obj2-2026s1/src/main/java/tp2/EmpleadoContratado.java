package tp2;

import lombok.Getter;
import tp4.supermercado.MedioDePago;

import java.time.LocalDate;

@Getter
public class EmpleadoContratado extends Empleado{
    private int nroContrato;
    private MedioDePago medioDePago;

    EmpleadoContratado(
            String nombre,
            String direccion,
            String estadoCivil,
            double sueldoBasico,
            LocalDate fechaNacimiento,
            int nroContrato,
            MedioDePago medioDePago
    ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = sueldoBasico;
        this.fechaNacimiento = fechaNacimiento;
        this.nroContrato = nroContrato;
        this.medioDePago = medioDePago;
    }

    @Override
    public double getSueldoBruto(){
        return sueldoBasico;
    }

    @Override
    public double getRetenciones(){
        return 50;
    }
}
