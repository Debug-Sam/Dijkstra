package domain.stappen;

import domain.Stap;

public class Autorit extends Stap {
    private int kilometers;

    public Autorit(String naam, String puntA, String puntB, int kostenEuros) {
        super(naam, puntA, puntB);
        this.kilometers = kostenEuros;
    }

    public int getKilometers() {
        return kilometers;
    }

    @Override
    public String toString() {
        return "Autorit { " +
                "kilometers=" + kilometers +
                '}';
    }
}
