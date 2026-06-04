package tp3.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tp3.Multiplos;

public class MultiplosTest {
    @Test

    public void test001_cantidadDePares() {
        Multiplos multiplos = new Multiplos();

        int mayorMultiplo = multiplos.getNumeroMasAltoEntre0y1000(5, 10);
        Assertions.assertEquals(1000, mayorMultiplo);
    }
}
