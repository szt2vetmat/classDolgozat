import java.util.ArrayList;
import java.util.List;
public class Noveny {
    String nev;
    int vizigeny;
    double vizmennyiseg;

    public Noveny(String nev, int vizigeny, double vizmennyiseg) {
        this.nev = nev;
        this.vizigeny = vizigeny;
        this.vizmennyiseg = vizmennyiseg;
    }

    boolean szuksegVanVizre() {
        return vizmennyiseg < vizigeny;
    }

    void ontoz(double vizmennyiseg) {

    }
}


