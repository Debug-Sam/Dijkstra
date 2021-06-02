package domain.stappen;

import domain.Stap;

public class Vlucht extends Stap {

    private int kostenEuros;

    public Vlucht(String naam, String puntA, String puntB, int kostenEuros) {
        super(naam, puntA, puntB);
        this.kostenEuros = kostenEuros;
    }

    public int getKostenEuros() {
        return kostenEuros;
    }


    @Override
    public String toString() {
        return "Vlucht{ " + getNaam() +
                "kostenEuros=" + kostenEuros +
                '}';
    }

}
