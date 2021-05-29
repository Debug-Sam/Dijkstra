package domain;

import java.util.*;

public class Reis {

    private List<Stap> alleStappen = new ArrayList<>();

    public List<Stap> getAlleStappen() {
        return alleStappen;
    }

    public void setAlleStappen(List<Stap> alleStappen) {
        this.alleStappen = alleStappen;
    }

    public void voegStapToe(Stap A) {
        alleStappen.add(A);
    }

    @Override
    public String toString() {
        return "Reis{" +
                "alleStappen=" + alleStappen +
                '}';
    }
}
