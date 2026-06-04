package tp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientesTest {

    @Test
    void test0001_cantidadProductos(){
        Cliente cliente1 = new Cliente();
        Producto banana= new ProductoCooperativa(100);
        cliente1.agregarProducto(banana);
        assertEquals(1, cliente1.getProductos().size());
    }
}
