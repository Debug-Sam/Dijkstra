import domain.Locatie;
import domain.Reis;
import domain.stappen.Autorit;

public class Main {

        public static void main(String[] args) {

            Reis nieuwe_reis = new Reis();

            Locatie utrecht = new Locatie("Utrecht");
            Locatie amsterdam = new Locatie("Amsterdam");

            Autorit utrecht_amsterdam = new Autorit(utrecht,amsterdam, 10);

            nieuwe_reis.voegStapToe(utrecht_amsterdam);


        }

}
