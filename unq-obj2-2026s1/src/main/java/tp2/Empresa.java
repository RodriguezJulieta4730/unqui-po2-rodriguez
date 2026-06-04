package tp2;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter // crea los getters de la empresa
public class Empresa {
    private String nombre;
    private int cuit;
    private ArrayList<Empleado> empleados = new ArrayList<>();
    private ArrayList<ReciboDeHaberes> recibos = new ArrayList<>();

    public double getTotalDeSueldosNetos(){
        double sueldos = 0;
        for (Empleado e : empleados){
            sueldos += e.getSueldoNeto(); // es lo mismo que hacer sueldos = sueldos + e.getSueldoNeto()
        }
        return sueldos;
    }

    public double getTotalDeSueldosBruto () {
        double sueldos = 0;
        for (Empleado e : empleados){
            sueldos += e.getSueldoBruto();
        }
        return sueldos;
    }

    public double getTotalDeRetenciones (){
        double retenciones = 0;
        for (Empleado e : empleados){
            retenciones += e.getRetenciones();
        }
        return retenciones;
    }

    public void liquidarSueldos() {
        for (Empleado e : empleados){
            ReciboDeHaberes recibo = new ReciboDeHaberes(
                    e.getNombre(),
                    e.getDireccion(),
                    LocalDate.now(),
                    e.getSueldoBruto(),
                    e.getSueldoNeto(),
                    "desgloce de conceptos: "
            );
            recibos.add(recibo);
        }
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
}
