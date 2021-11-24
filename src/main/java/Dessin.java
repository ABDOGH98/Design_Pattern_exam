import java.util.LinkedList;
import java.util.List;


public abstract class Dessin {
    private List<Figure> figures = new LinkedList<>();
    private Strategy strategy;
    public void traiter(){
        strategy.operationStrategy();
    }
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void addFigure(Figure figure){
        this.figures.add(figure);
    }
    public void removeFigure(Figure figure){
        figures.remove(figure);
    }
}
