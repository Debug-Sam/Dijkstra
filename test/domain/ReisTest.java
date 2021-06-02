package domain;

import domain.stappen.Autorit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReisTest {

    Autorit testAB = new Autorit("testAB", "a", "b", 10);
    Autorit testBC = new Autorit("testBC", "b", "c", 20);
    Autorit testAC = new Autorit("testAc", "a", "c", 40);
    Reis testreis =  new Reis("a", "c");

    @Test
    void addStap() {
        testreis.addStap(testAB.getKilometers(), testAB);
        assertNotNull(testreis.getStappen());
    }

    @Test
    void dijkstra() {
        testreis.addStap(testAB.getKilometers(), testAB);
        testreis.addStap(testBC.getKilometers(), testBC);
        testreis.addStap(testAC.getKilometers(), testAC);
        testreis.dijkstra();
        assertNotNull(testreis.getReis());
    }
}