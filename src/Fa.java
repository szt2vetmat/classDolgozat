import java.util.ArrayList;
import java.util.List;
class Fa extends Noveny {
    public Fa(String nev, double vizmennyiseg) {
        super(nev, 10, vizmennyiseg);
    }

    @Override
    void ontoz(double vizmennyiseg) {
        if (szuksegVanVizre()) {
            vizmennyiseg += 0.4 * vizmennyiseg;
        }
    }
}