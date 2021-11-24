import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int color;
    private int remplissage ;
    private int epaisseur ;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserves() {
        for(Observer o:observers){
            o.update(this);
        }
    }

    public int getColor() {
        return color;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setColor(int color) {
        this.color = color;
        notifyObserves();
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
        notifyObserves();
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
        notifyObserves();
    }
}
