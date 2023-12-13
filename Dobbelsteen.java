//Mike Schardijn, IT101: rollen tot je gooit wat je wilt
//anders werkt de scanner niet
import java.util.Scanner;

//standaard opening
public class Dobbelsteen {

    public static void main(String[] args) {

        //anders werkt de scanner niet
        Scanner input = new Scanner(System.in);

        //vraag hoeveel ogen de gebruiker wilt rollen
        System.out.print("Geef hier het aantal ogen waarvoor U wilt rollen: ");
        int GewensteOgen = input.nextInt();

        //verschillende vairabelen
        int Zes = 6;
        int EEN = 1;
        int NUL = 0;
        int Cijfer = NUL;

        do {
            Cijfer = Cijfer * NUL;

            Cijfer += (Math.random() * Zes) + EEN;

            switch (Cijfer) {
                case 1:
                    System.out.println(" ");
                    System.out.println("*");
                    System.out.println(" ");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;
                case 2:
                    System.out.println("*");
                    System.out.println(" ");
                    System.out.println("  *");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;
                case 3:
                    System.out.println("*");
                    System.out.println(" *");
                    System.out.println("  *");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;
                case 4:
                    System.out.println("* *");
                    System.out.println(" ");
                    System.out.println("* *");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;
                case 5:
                    System.out.println("* *");
                    System.out.println(" *");
                    System.out.println("* *");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;
                case 6:
                    System.out.println("* *");
                    System.out.println("* *");
                    System.out.println("* *");
                    System.out.println(" ");
                    Cijfer = NUL;
                    break;

            }

        }
        while (Cijfer != GewensteOgen);
    }
}



