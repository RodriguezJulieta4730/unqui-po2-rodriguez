package tp4.Supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp4.supermercado.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 1000, false,0.1);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(900, leche.getPrecio());
	}
}
