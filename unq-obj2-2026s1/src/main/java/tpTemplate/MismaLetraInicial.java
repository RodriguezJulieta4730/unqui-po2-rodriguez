package tpTemplate;

public class MismaLetraInicial extends Filtro{
    @Override
    boolean sonSimilares(WikipediaPage page1, WikipediaPage page2) {
        return page1.getTitle().charAt(0) == page2.getTitle().charAt(0); //charAt me da la posicion 0 del string osea la primera letra
    }
}
