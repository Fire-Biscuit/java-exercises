//Mike Schardijn, IT101: oefentoets week 4
//anders werkt de scanner niet
import java.util.Scanner;

//standaard opening
public class PlofSpel {

    public static void main(String[] args) {

        //anders werkt de scanner niet
        Scanner input = new Scanner(System.in);

        int TIEN = 10;
        int NUL = 0;
        int TWEE = 2;
        int EEN = 1;
        int Teller = NUL;
        int Ronde = NUL;
        int Getal = NUL;

        do {
            if (Ronde == NUL) {
                //vraag om een getal
                System.out.print("Wat is het plofgetal (2..9)?");
                Getal = input.nextInt();
                Ronde += EEN;
            } else if (Ronde > NUL) {
                System.out.println("Onjuist plofgetal! Vul een geldig plofgetal in (2..9)");
                System.out.print("Wat is het plofgetal (2..9)?");
                Getal = input.nextInt();
            }
        } while (Ronde > NUL && Getal < TIEN && Getal > TWEE);

                System.out.println("Tot en met welk getal moet ik tellen? ");
            double Nummer = input.nextInt();

            do {
                Teller += EEN;
                if (Teller / Getal == (Math.round(Teller / Getal))) {
                    System.out.print(Getal);
                } else {
                    System.out.print("plof");
                }
            } while (Teller < Nummer);
        }
    }

