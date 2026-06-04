package tp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoTest {
    @Test
    void test001_precioProducto(){
        ProductoCooperativa banana = new ProductoCooperativa(100);
        assertEquals(90,banana.getPrecio());
    }

    @Test
    void test002_precioProducto(){
        ProductoEmpresaTrad banana = new ProductoEmpresaTrad(100);
        assertEquals(100,banana.getPrecio());
    }
}
