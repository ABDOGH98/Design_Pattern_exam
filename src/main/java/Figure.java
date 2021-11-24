

public abstract class Figure extends Dessin implements Observer {

    protected Point point;
    public abstract void afficher();
    public abstract double calculPerimetre();
    public abstract double calculSurface();

    @Override
    public void update(Subject subject) {
        int color = ((SubjectImpl)subject).getColor();
        int epaisseur = ((SubjectImpl)subject).getEpaisseur();
        int remplissage = ((SubjectImpl)subject).getRemplissage();
        System.out.println("color was : "+color+" && epaisseur was : "+epaisseur+" && remplissage was : "+remplissage);
    }
}
