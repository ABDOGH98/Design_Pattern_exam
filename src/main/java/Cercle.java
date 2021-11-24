public class Cercle extends Figure {

    private int r ;

    public Cercle(int r , int color , int epaisseur, int remplissage){
        this.r = r;
    }

    @Override
    public void afficher() {
        System.out.println("Dessin cercle OOOOOOOOOOOOOOOOOOOOOOOOOO");
    }

    @Override
    public double calculPerimetre() {
        return 3.14*2*r;
    }

    @Override
    public double calculSurface() {
        return 3.14*r*r;
    }
}
