package tp2;

import java.time.LocalDate;

public class ReciboDeHaberes {
    private String nombreEmpleado;
    private String  direccion;
    private LocalDate fechaEmision;
    private Double sueldoBruto;
    private Double sueldoNeto;
    private String conceptos;

    public ReciboDeHaberes(String nombre, String direccion, LocalDate fechaDeEmison, double sueldoBruto, double sueldoNeto, String conceptos) {
        this.nombreEmpleado = nombre;
        this.direccion = direccion;
        this.fechaEmision = fechaDeEmison;
        this.sueldoBruto=sueldoBruto;
        this.sueldoNeto=sueldoNeto;
        this.conceptos=conceptos;
    }
}
