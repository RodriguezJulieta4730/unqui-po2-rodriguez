package tpComposite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CultivosTest {
    @Test
    void test001_parcelaConCultivos(){
        Cultivo soja = new CultivoSoja();
        Cultivo trigo = new CultivoTrigo();
        Cultivo parcela1 = new Parcela(soja,soja,trigo,trigo);

        assertEquals(1600, parcela1.ganancias());

    }

    @Test
    void test002_parcelaConSubParcela(){
        Cultivo soja = new CultivoSoja();
        Cultivo trigo = new CultivoTrigo();
        Cultivo parcela1 = new Parcela(soja,soja,trigo,trigo);
        Cultivo parcela2 = new Parcela(soja,soja,trigo,parcela1);

        assertEquals(1700, parcela2.ganancias());

    }

    @Test
    void test003_parcelaConDosSubParcela() {
        Cultivo soja = new CultivoSoja();
        Cultivo trigo = new CultivoTrigo();
        Cultivo parcela1 = new Parcela(soja, soja, trigo, trigo);
        Cultivo parcela2 = new Parcela(soja, parcela1, trigo, parcela1);

        assertEquals(1600, parcela2.ganancias());
    }

    @Test
    void test004_parcelaConsubSubparcelas() {
        Cultivo soja = new CultivoSoja();
        Cultivo trigo = new CultivoTrigo();
        Cultivo parcela1 = new Parcela(soja, soja, trigo, trigo);
        Cultivo parcela2 = new Parcela(soja, parcela1, trigo, parcela1);
        Cultivo parcela3 = new Parcela(soja, soja, trigo, parcela2);

        assertEquals(1700, parcela3.ganancias());
    }
}
