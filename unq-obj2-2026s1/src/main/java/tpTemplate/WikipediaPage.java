package tpTemplate;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
    String getTitle();
    List<WikipediaPage> getLiks();
    Map<String,WikipediaPage> getInfobox();
}
