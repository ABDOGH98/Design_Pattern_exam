public class Rectangle extends Figure {

    private int h ;
    private int l ;

    public Rectangle(int  l , int h){
        this.l = l ;
        this.h = h ;
    };

    @Override
    public void afficher() {
        System.out.println("Dessin Rect ---------------");
    }

    @Override
    public double calculPerimetre() {
        return 2*l*h;
    }

    @Override
    public double calculSurface() {
        return l*h;
    }

}
