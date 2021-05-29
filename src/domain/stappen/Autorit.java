package domain.stappen;

import domain.Locatie;
import domain.Stap;

public class Autorit extends Stap {

    private int kosten;

    public Autorit(Locatie puntA, Locatie puntB, int kosten) {
        super(puntA, puntB);

    }

}
