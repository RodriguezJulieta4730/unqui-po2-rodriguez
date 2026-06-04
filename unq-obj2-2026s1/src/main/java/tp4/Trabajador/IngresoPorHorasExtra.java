package tp4.Trabajador;

import lombok.Getter;

@Getter
public class IngresoPorHorasExtra extends Ingreso {
    int cantHorasExtra;
    IngresoPorHorasExtra (Mes mes, String concepto, int montoPercibido, int cantHorasExtra){
        super(mes, concepto, montoPercibido);
        this.cantHorasExtra = cantHorasExtra;
    }
    @Override
    double getMontoImponible(){
        return 0;
    }
}
