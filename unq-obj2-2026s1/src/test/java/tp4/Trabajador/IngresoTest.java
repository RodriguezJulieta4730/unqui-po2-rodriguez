package tp4.Trabajador;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngresoTest {

    private Ingreso ingreso1;
    private Ingreso ingreso2;
    private IngresoPorHorasExtra ingreso3;

    @BeforeEach
    public void setUp() {
        ingreso1 = new Ingreso (Mes.MARZO, "Aguinaldo", 500000);
        ingreso2 = new Ingreso (Mes.SEPTIEMBRE, "Comision", 100000);
        ingreso3 = new IngresoPorHorasExtra(Mes.ENERO, "Horas extra", 150000, 4);
    }

    @Test
    public void testConstructor() {
        assertEquals(Mes.MARZO, ingreso1.getMesRecepcion());
        assertEquals("Aguinaldo", ingreso1.getConcepto());
        assertEquals(500000, ingreso1.getMontoPercibido());

        assertEquals(Mes.SEPTIEMBRE, ingreso2.getMesRecepcion());
        assertEquals("Comision", ingreso2.getConcepto());
        assertEquals(100000, ingreso2.getMontoPercibido());

        assertEquals(Mes.ENERO, ingreso3.getMesRecepcion());
        assertEquals("Horas extra", ingreso3.getConcepto());
        assertEquals(150000, ingreso3.getMontoPercibido());
    }

}
