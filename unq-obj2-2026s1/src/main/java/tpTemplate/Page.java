package tpTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage {
    private String titulo;
    private List<WikipediaPage> links= new ArrayList<>();
    private Map<String,WikipediaPage> propiedades = new HashMap<>();

    public Page(String unTitulo) {
        this.titulo=unTitulo;
    }

    public Page(String titulo, List<WikipediaPage> links) {
        this.titulo=titulo;
        this.links=links;
    }

    public Page(String titulo, Map<String,WikipediaPage> propiedades) {
        this.titulo=titulo;
        this.propiedades=propiedades;
    }

    @Override
    public String getTitle() {
        return titulo;
    }

    @Override
    public List<WikipediaPage> getLiks() {
        return links;
    }

    @Override
    public Map<String, WikipediaPage> getInfobox() {
        return propiedades;
    }
}
