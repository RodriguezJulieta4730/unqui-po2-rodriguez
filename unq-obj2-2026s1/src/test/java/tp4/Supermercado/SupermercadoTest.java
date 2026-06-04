package tp4.Supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp4.supermercado.Producto;
import tp4.supermercado.ProductoPrimeraNecesidad;
import tp4.supermercado.Supermercado;

import static org.junit.jupiter.api.Assertions.*;

public class SupermercadoTest {
	
	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoPrimeraNecesidad("Arroz", 18, true, 0.11);
		detergente = new Producto("Detergente", 75);
		supermercado = new Supermercado();
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.getCantidadDeProductos());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(2, supermercado.getCantidadDeProductos());
	}
	
	@Test
	public void testPrecioTotal() {
		assertEquals(0, supermercado.getPrecioTotal());
		supermercado.agregarProducto(arroz);
		supermercado.agregarProducto(detergente);
		assertEquals(91.2, supermercado.getPrecioTotal());
	}
}
