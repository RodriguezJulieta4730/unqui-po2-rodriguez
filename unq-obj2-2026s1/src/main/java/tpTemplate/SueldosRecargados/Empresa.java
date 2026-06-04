package tpTemplate.SueldosRecargados;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    List<Empleado> empleados = new ArrayList<>();
    public void contratar(Empleado unEmpleado) {
        empleados.add(unEmpleado);
    }

    public double salarios() {
        double totalSalarios= 0;
        for( Empleado e: empleados){
            totalSalarios+= e.salario();
        }
        return totalSalarios;
    }

}
