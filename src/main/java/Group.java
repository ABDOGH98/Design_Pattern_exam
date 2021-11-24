import java.util.LinkedList;
import java.util.List;

public class Group extends Figure {
    private List<Figure> figures = new LinkedList<>();

    @Override
    public void afficher() {
        for (Figure f : figures){
            System.out.println("Dessin de figure : "+f);
        }
    }

    @Override
    public double calculPerimetre() {
        double p = 0 ;
        for (Figure f : figures){
            p+= f.calculPerimetre();
        }
        return p;
    }

    @Override
    public double calculSurface() {
        double s = 0 ;
        for (Figure f : figures){
            s+= f.calculSurface();
        }
        return s;
    }
}
