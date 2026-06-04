package tpTemplate;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ElementosSimilaresTest {
    @Test
    void test0001MismaLetraInicial(){
        WikipediaPage pagina1 = new Page("La Plata");
        WikipediaPage pagina2 = new Page("Lobo");
        WikipediaPage pagina3 = new Page("Lucas Art");
        WikipediaPage pagina4 = new Page("Buenos Aires");
        List<WikipediaPage> paginas = List.of(pagina2,pagina3,pagina4);
        Filtro filtro = new MismaLetraInicial();
        List<WikipediaPage> similares = filtro.getSimilarPages(pagina1,paginas);
        assertTrue(similares.contains(pagina2));
        assertTrue(similares.contains(pagina3));
        assertFalse(similares.contains(pagina4));
    }

    @Test
    void test0002LinksComunes(){
        WikipediaPage pagina1 = new Page("La Plata");
        WikipediaPage pagina2 = new Page("Lobo");
        WikipediaPage pagina3 = new Page("Lucas Art",List.of(pagina1));
        WikipediaPage pagina4 = new Page("Buenos Aires",List.of(pagina1));
        List<WikipediaPage> paginas = List.of(pagina2,pagina3,pagina1);
        Filtro filtro = new LinkEnComun();
        List<WikipediaPage> similares = filtro.getSimilarPages(pagina4,paginas);
        assertFalse(similares.contains(pagina2));
        assertTrue(similares.contains(pagina3));
        assertFalse(similares.contains(pagina1));
    }

    @Test
    void test0003PropiedadEnComun(){
        WikipediaPage pagina1 = new Page("La Plata");
        WikipediaPage pagina2 = new Page("Lobo");
        WikipediaPage pagina3 = new Page("Lucas Art", Map.of("birth_place", pagina1));
        WikipediaPage pagina4 = new Page("Buenos Aires",Map.of("birth_place", pagina2));
        List<WikipediaPage> paginas = List.of(pagina2,pagina3,pagina1);
        Filtro filtro = new PropiedadComun();
        List<WikipediaPage> similares = filtro.getSimilarPages(pagina4,paginas);
        assertFalse(similares.contains(pagina2));
        assertTrue(similares.contains(pagina3));
        assertFalse(similares.contains(pagina1));
    }
}
