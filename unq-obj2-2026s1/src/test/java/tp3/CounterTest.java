package tp3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CounterTest {
    @Test
    public void test001_cantidadDePares() {
        Counter contador = new Counter();
        contador.addNumber(1);
        contador.addNumber(2);
        contador.addNumber(3);
        contador.addNumber(5);
        contador.addNumber(7);
        contador.addNumber(9);

        int cantidad = contador.getCantidadDePares();
        Assertions.assertEquals(1, cantidad);
    }

    @Test
    public void test002_cantidadDeImpares() {
        Counter contador = new Counter();
        contador.addNumber(1);
        contador.addNumber(2);
        contador.addNumber(3);
        contador.addNumber(5);
        contador.addNumber(7);
        contador.addNumber(9);

        int cantidad = contador.getCantidadDeImpares();
        Assertions.assertEquals(5, cantidad);
    }

    @Test
    public void test002_cantidadDeMultiplos() {
        Counter contador = new Counter();
        contador.addNumber(1);
        contador.addNumber(2);
        contador.addNumber(3);
        contador.addNumber(4);
        contador.addNumber(5);
        contador.addNumber(6);

        int cantidad = contador.getCantidadDeMultiplos(2);
        Assertions.assertEquals(3, cantidad);
    }
}
