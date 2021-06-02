package domain;

public class Stap {

    private String naam;
    private String puntA;
    private String puntB;

    public Stap(String naam, String puntA, String puntB ) {
        this.naam = naam;
        this.puntA = puntA;
        this.puntB = puntB;
    }

    public String getOther(String current) {
        if (this.puntA == current) {
            return this.puntB;
        } else if (this.puntB == current) {
            return this.puntA;
        }
        return null;
    }

    public String getNaam() {
        return naam;
    }

    public String getpuntA() {
        return puntA;
    }

    public String getpuntB() {
        return puntB;
    }
}
