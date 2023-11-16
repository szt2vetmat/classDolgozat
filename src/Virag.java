import java.util.ArrayList;
import java.util.List;
public class Virag extends Noveny {
    public Virag(String nev, double vizmennyiseg) {
        super(nev, 5, vizmennyiseg);
    }

    @Override
    void ontoz(double vizmennyiseg) {
        if (szuksegVanVizre()) {
            vizmennyiseg += 0.75 * vizmennyiseg;
        }
    }
}