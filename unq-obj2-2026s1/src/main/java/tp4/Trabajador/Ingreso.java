package tp4.Trabajador;

import lombok.Getter;
@Getter
public class Ingreso {
    Mes mesRecepcion;
    String concepto;
    double montoPercibido;

    public Ingreso (Mes mes, String concepto, double montoPercibido){
        this.mesRecepcion = mes;
        this.concepto =concepto;
        this.montoPercibido = montoPercibido;
    }

    double getMontoImponible(){
        return montoPercibido;
    }
}
