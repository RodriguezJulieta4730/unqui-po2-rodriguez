package tp2;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class EmpleadoDePlantaTemporaria extends Empleado{
    private LocalDate fechaFinDesignacion;
    private int cantDeHorasExtra;

    EmpleadoDePlantaTemporaria(
            String nombre,
            String direccion,
            String estadoCivil,
            double sueldoBasico,
            LocalDate fechaNacimiento,
            LocalDate fechaFinDesignacion,
            int cantDeHorasExtra){
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.sueldoBasico = sueldoBasico;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaFinDesignacion = fechaFinDesignacion;
        this.cantDeHorasExtra = cantDeHorasExtra;
    }

    @Override
    public double getSueldoBruto(){
        return sueldoBasico + cantDeHorasExtra*40 ;
    }
    @Override
    public double getRetenciones() {
        return getSueldoBruto() * 0.1 +
                getRetencionPorEdad()+
                getAporteJubilatorio();
    }

    private double getAporteJubilatorio() {
        return getSueldoBruto() * 0.1 + 5 * cantDeHorasExtra;
    }

    private double getRetencionPorEdad() {
        return getEdad() > 50 ? 25 : 0;
    }


}
