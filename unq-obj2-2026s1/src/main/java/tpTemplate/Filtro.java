package tpTemplate;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
    public  List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> pages){
        List<WikipediaPage> similares = new ArrayList<>();
        for(WikipediaPage p: pages){
            if(sonSimilares(page,p)){
                similares.add(p);
            }
        }
        return similares;
    }

   abstract boolean sonSimilares(WikipediaPage page1, WikipediaPage page2); //lo implementan los filtros especificos

}
