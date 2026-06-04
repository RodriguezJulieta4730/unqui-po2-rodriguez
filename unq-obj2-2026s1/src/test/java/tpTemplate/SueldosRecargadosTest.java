package tpTemplate;

import org.junit.jupiter.api.Test;
import tpTemplate.SueldosRecargados.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SueldosRecargadosTest {
    @Test
    void test001_EmpleadoTemporario(){
        Empresa empresa = new Empresa();
        Empleado empleado1 = new EmpleadoTemporario(8,2,true);
        empresa.contratar(empleado1);
        assertEquals(1140*0.87, empresa.salarios());
        assertEquals(1140*0.87, empleado1.salario());
    }

    @Test
    void test002_EmpleadoPasante(){
        Empresa empresa = new Empresa();
        Empleado empleado1 = new EmpleadoPasante(8);
        empresa.contratar(empleado1);
        assertEquals(320*0.87, empresa.salarios());
        assertEquals(320*0.87, empleado1.salario());
    }

    @Test
    void test003_EmpleadoPlanta(){
        Empresa empresa = new Empresa();
        Empleado empleado1 = new EmpleadoPlanta(2);
        empresa.contratar(empleado1);
        assertEquals(3300*0.87, empresa.salarios());
        assertEquals(3300*0.87, empleado1.salario());
    }

    @Test
    void test004_Empleados(){
        Empresa empresa = new Empresa();
        Empleado empleado1 = new EmpleadoPlanta(2);
        Empleado empleado2 = new EmpleadoTemporario(8,2,true);
        Empleado empleado3 = new EmpleadoPasante(8);
        empresa.contratar(empleado1);
        empresa.contratar(empleado2);
        empresa.contratar(empleado3);

        assertEquals(4141.2, empresa.salarios());
    }


}
