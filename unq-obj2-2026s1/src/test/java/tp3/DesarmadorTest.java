package tp3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DesarmadorTest {
    @Test
    public void test001_NumeroConMasDigitosPares(){
        Desarmador desarmador = new Desarmador();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(20);
        lista.add(246);
        int numeroConMasPares = desarmador.getNumeroConMasDigitosPares(lista);
        Assertions.assertEquals(246,numeroConMasPares);
    }
}
