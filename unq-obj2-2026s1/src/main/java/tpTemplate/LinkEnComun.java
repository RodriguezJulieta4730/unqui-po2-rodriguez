package tpTemplate;

import java.util.List;

public class LinkEnComun extends Filtro {
    @Override
    boolean sonSimilares(WikipediaPage page1, WikipediaPage page2) {
        List<WikipediaPage> links2 = page2.getLiks(); // Reemplaza 'String' por el tipo real de tus links si no son texto

        return page1.getLiks().stream()
                .anyMatch(links2::contains);
    }
}
