package tp2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class EmpresaTest {
    Empresa empresa;
    @BeforeEach
    void setUp(){
        empresa= new Empresa();
        Empleado juli = new EmpleadoDePlantaPermanente("Julieta", "Boedo 671", "Soltero", 1000000, LocalDate.of(2006,3,28), 0,10);
        empresa.agregarEmpleado(juli);
    }

    @Test
    void test001_TotalSueldosNetos(){
        Assertions.assertEquals(750375, empresa.getTotalDeSueldosNetos());
    }

    @Test
    void test002_TotalSueldosBrutos(){
        Assertions.assertEquals(1000500, empresa.getTotalDeSueldosBruto());
    }

    @Test
    void test003_TotalDeRetenciones(){
        Assertions.assertEquals(250125, empresa.getTotalDeRetenciones());
    }

    @Test
    void test004_LiquidarSueldos(){
        empresa.liquidarSueldos();
        Assertions.assertFalse(empresa.getRecibos().isEmpty());
        Assertions.assertEquals(1 , empresa.getRecibos().size());
    }

}
