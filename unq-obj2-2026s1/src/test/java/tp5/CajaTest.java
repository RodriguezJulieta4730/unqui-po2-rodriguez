package tp5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CajaTest {

    @Test
    void test001_atenderCliente(){
        Caja caja1 = new Caja();
        Cliente cliente1 = new Cliente();
        Producto banana = new ProductoCooperativa(100);

        cliente1.agregarProducto(banana);
        caja1.llegaUnCliente(cliente1);
        caja1.agregarStock(banana,5);

        caja1.atenderCliente();

        assertEquals(0, caja1.getClientesEsperando().size());
        assertEquals(4,caja1.stockDe(banana));
    }

    @Test
    void test0002_cobroDeImpuestos(){
        Caja caja1 = new Caja();
        Cliente cliente1 = new Cliente();
        Factura agua = new Servicio(5, 100);
        Factura arba = new Impuesto(100);

        cliente1.agregarFactura(agua);
        cliente1.agregarFactura(arba);

        caja1.cobrarFacturas(cliente1);

        assertEquals(600, caja1.getCaja());
    }
}
