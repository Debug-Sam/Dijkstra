package domain;

import domain.stappen.Autorit;

import java.util.*;

public class Reis {

    private String beginStad;
    private String eindStad;
    private Map<Stap, Integer> stappen = new HashMap<>();
    private Map<Stap, Integer> reis = new HashMap<>();

    public Reis(String beginStad, String eindStad) {
        this.beginStad = beginStad;
        this.eindStad = eindStad;
    }

    public void addStap(Integer value, Stap x) {
        this.stappen.put(x, value);
    }

    @Override
    public String toString() {
        return "Reis{" +
                "beginStad=" + beginStad +
                ", eindStad=" + eindStad +
                ", Reis=" + reis +
                '}';
    }

    public void dijkstra() {
        Map<Stap, Integer> mogelijkeStappen = getMogelijkeStappen(this.beginStad);
        String antwoord = this.beginStad;
        while (!this.eindStad.equals(antwoord)) {
            Map<Stap, Integer> next = getKorstePad(mogelijkeStappen);
            Stap nextStap = (Stap) next.keySet().toArray()[0];
            System.out.println(next);
            reis.put(nextStap, next.get(nextStap));
            antwoord = nextStap.getOther(antwoord);
            mogelijkeStappen = getMogelijkeStappen(antwoord);
        }
    }

    private Map<Stap, Integer> getMogelijkeStappen(String CurrentPosition) {
        Map<Stap, Integer> mogelijkeStappen = new HashMap<>();
        for (Stap key:
                this.stappen.keySet()) {
            if (key.getpuntA().equals(CurrentPosition) || key.getpuntB().equals(CurrentPosition)) {
                if (!reis.containsKey(key)) {
                    mogelijkeStappen.put(key, this.stappen.get(key));
                }
            }
        }
        return mogelijkeStappen;
    }

    private Map<Stap, Integer> getKorstePad(Map<Stap, Integer> stappen) {
        Map<Stap, Integer> shortest = new HashMap<>();
        Stap min = null;
        for (Stap key:
                stappen.keySet()) {
            if (stappen.get(key) < stappen.getOrDefault(min, 100000)) {
                min = key;
            }
        }
        shortest.put(min, stappen.get(min));
        return shortest;
    }

    public String getBeginStad() {
        return beginStad;
    }

    public void setBeginStad(String beginStad) {
        this.beginStad = beginStad;
    }

    public String getEindStad() {
        return eindStad;
    }

    public void setEindStad(String eindStad) {
        this.eindStad = eindStad;
    }

    public Map<Stap, Integer> getStappen() {
        return stappen;
    }

    public void setStappen(Map<Stap, Integer> stappen) {
        this.stappen = stappen;
    }

    public Map<Stap, Integer> getReis() {
        return reis;
    }

    public void setReis(Map<Stap, Integer> reis) {
        this.reis = reis;
    }

}
