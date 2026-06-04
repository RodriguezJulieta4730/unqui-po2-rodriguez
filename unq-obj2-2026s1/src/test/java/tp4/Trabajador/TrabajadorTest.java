package tp4.Trabajador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrabajadorTest {

    private Ingreso ingreso1;
    private Ingreso ingreso2;
    private  Ingreso ingreso3;
    private Trabajador trabajador1;
    private Trabajador trabajador2;

    @BeforeEach
    public void setUp(){
        ingreso1 = new Ingreso (Mes.MARZO, "Aguinaldo", 500000);
        ingreso2 = new Ingreso (Mes.SEPTIEMBRE, "Comision", 100000);
        ingreso3 = new IngresoPorHorasExtra(Mes.ENERO, "Horas extra", 150000,4);
        trabajador1= new Trabajador ();
        trabajador2= new Trabajador ();

    }

    @Test
    public void test001_cantIngresos(){
        assertEquals(0, trabajador1.getCantIngresos());
        trabajador1.agregarIngreso(ingreso1);
        trabajador1.agregarIngreso(ingreso2);
        trabajador2.agregarIngreso(ingreso3);

        assertEquals(2, trabajador1.getCantIngresos());
        assertEquals(1, trabajador2.getCantIngresos());
    }

    @Test
    public void test002_totalPercibido(){
        assertEquals(0, trabajador1.getTotalPercibido());
        trabajador1.agregarIngreso(ingreso1);
        trabajador1.agregarIngreso(ingreso2);
        trabajador2.agregarIngreso(ingreso3);

        assertEquals(600000, trabajador1.getTotalPercibido());
        assertEquals(150000, trabajador2.getTotalPercibido());
    }

    @Test
    public void test003_TotalMontoImponible(){
        assertEquals(0, trabajador1.getTotalMontoImponible());
        trabajador1.agregarIngreso(ingreso1);
        trabajador1.agregarIngreso(ingreso2);
        trabajador2.agregarIngreso(ingreso3);

        assertEquals(600000, trabajador1.getTotalMontoImponible());
        assertEquals(0, trabajador2.getTotalMontoImponible());
    }

    @Test
    public void test003_ImpuestoAPagar(){
        assertEquals(0, trabajador1.getImpuestoAPagar());
        trabajador1.agregarIngreso(ingreso1);
        trabajador1.agregarIngreso(ingreso2);
        trabajador2.agregarIngreso(ingreso3);

        assertEquals(12000, trabajador1.getImpuestoAPagar());
        assertEquals(0, trabajador2.getImpuestoAPagar());
    }
}
