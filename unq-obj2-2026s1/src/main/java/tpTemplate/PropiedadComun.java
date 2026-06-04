package tpTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PropiedadComun extends Filtro {
    @Override
    boolean sonSimilares(WikipediaPage page1, WikipediaPage page2) {
        Map<String, WikipediaPage> infobox2 = page2.getInfobox();

        return page1.getInfobox().keySet().stream()
                .anyMatch(infobox2::containsKey);
    }
}
