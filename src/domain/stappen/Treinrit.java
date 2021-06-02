package domain.stappen;

import domain.Stap;

public class Treinrit extends Stap {

    private int tijdMinuten;

    public Treinrit(String naam, String puntA, String puntB, int tijdMinuten) {
        super(naam, puntA, puntB);
        this.tijdMinuten = tijdMinuten;
    }

    public int getTijdMinuten() {
        return tijdMinuten;
    }

    @Override
    public String toString() {
        return "Treinrit { " +
                "tijdMinuten=" + tijdMinuten +
                '}';
    }
}
