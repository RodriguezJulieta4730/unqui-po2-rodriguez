package tp4.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
    private final List<Ingreso> ingresos = new ArrayList<>();

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }


    public int getCantIngresos() {
        return ingresos.size();
    }


    public double getTotalPercibido() {
        double ingresosPercibidos = 0;
        for (Ingreso i: ingresos){
            ingresosPercibidos += i.getMontoPercibido();
        }
        return ingresosPercibidos;
    }


    public double getTotalMontoImponible() {
        double totalMontoImponible = 0;
        for ( Ingreso i: ingresos){
            totalMontoImponible += i.getMontoImponible();
        }
        return totalMontoImponible;
    }

    public double getImpuestoAPagar() {
        return getTotalMontoImponible()*0.02;
    }
}

