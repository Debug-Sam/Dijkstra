import domain.Reis;
import domain.stappen.Autorit;
import domain.stappen.Treinrit;
import domain.stappen.Vlucht;

public class Main {

        public static void main(String[] args) {


                Autorit autoritAB = new Autorit("A-B", "a", "b", 10);
                Autorit autoritBC = new Autorit("B-C","b", "c", 30);
                Autorit autoritCD = new Autorit("C-D", "c", "d", 5);
                Autorit autoritDA = new Autorit("D-A", "d", "a", 60);
                Autorit autoritBD = new Autorit("B-D", "b", "d", 20);

                Reis autoReis = new Reis("a","c");

                autoReis.addStap(autoritAB.getKilometers(), autoritAB);
                autoReis.addStap(autoritBC.getKilometers(), autoritBC);
                autoReis.addStap(autoritCD.getKilometers(), autoritCD);
                autoReis.addStap(autoritDA.getKilometers(), autoritDA);
                autoReis.addStap(autoritBD.getKilometers(), autoritBD);

                autoReis.dijkstra();
                System.out.println(autoReis);


                Treinrit treinAB = new Treinrit("AB", "a", "b", 20);
                Treinrit treinBC = new Treinrit("BC", "b", "c", 10);
                Treinrit treinAC = new Treinrit("AC", "a", "c", 10);
                Treinrit treinCD = new Treinrit("CD", "c", "d", 20);
                Treinrit treinBD = new Treinrit("BD", "b", "d", 30);
                Treinrit treinBE = new Treinrit("BE", "b", "e", 10);
                Treinrit treinDE = new Treinrit("DE", "d", "e", 20);

                Reis treinReis = new Reis("a","e");

                treinReis.addStap(treinAB.getTijdMinuten(), treinAB);
                treinReis.addStap(treinBC.getTijdMinuten(), treinBC);
                treinReis.addStap(treinAC.getTijdMinuten(), treinAC);
                treinReis.addStap(treinCD.getTijdMinuten(), treinCD);
                treinReis.addStap(treinBD.getTijdMinuten(), treinBD);
                treinReis.addStap(treinBE.getTijdMinuten(), treinBE);
                treinReis.addStap(treinDE.getTijdMinuten(), treinDE);

                treinReis.dijkstra();
                System.out.println(treinReis);

                Vlucht vluchtAB = new Vlucht("AB", "Amsterdam", "Parijs", 100);
                Vlucht vluchtBC= new Vlucht("BC", "Parijs", "Shanghai", 1000);
                Vlucht vluchtCD = new Vlucht("CD", "Shanghai", "New-York", 500);
                Vlucht vluchtDA = new Vlucht("DA", "New-York", "Amsterdam", 5000);

                Reis vliegReis = new Reis("Amsterdam", "New-York");

                vliegReis.addStap(vluchtAB.getKostenEuros(), vluchtAB);
                vliegReis.addStap(vluchtBC.getKostenEuros(), vluchtBC);
                vliegReis.addStap(vluchtCD.getKostenEuros(), vluchtCD);
                vliegReis.addStap(vluchtDA.getKostenEuros(), vluchtDA);


                vliegReis.dijkstra();
                System.out.println(vliegReis);

                System.out.println("Zoals u kunt zien kan er met elk vaiabelen gerekent worden. Zolang het steeds integers zijn. ");
                System.out.println("De Hashmap draait de route als het waren om. Dus je moet de lijst van het antwoord andersom lezen van Rechts naar Links");
                System.out.println("De Hashmap zet constant de nieuwe waarde voor de oude waarde.");

        }

}
