import java.util.ArrayList;
import java.util.List;

public class Kert {
    List<Noveny> novenyek;

    public Kert() {
        this.novenyek = new ArrayList<>();
    }

    void kertAllapot() {
        for (Noveny noveny : novenyek) {
            System.out.println("A " + noveny.nev + "-nak vízre van szüksége");
        }
    }

    void ontoz(double vizmennyiseg) {
        System.out.println("\nÖntözés " + vizmennyiseg);
        for (Noveny noveny : novenyek) {
            noveny.ontoz(vizmennyiseg);
            if (noveny.szuksegVanVizre()) {
                System.out.println("A " + noveny.nev + "-nak vízre van szüksége");
            }
        }
    }
}
