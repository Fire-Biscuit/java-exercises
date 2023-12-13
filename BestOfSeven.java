//Dit programma is gemaakt door <Mike Scharidjn>, <IT-101>, <500911074>
//standaard opening
//tijd gedaan over het maken van dit progamma: [68 min 43 seconden]
//behaalde cijfer [9.0]

import java.util.Scanner;

public class BestOfSeven {

    public static void main(String[] args) {

        System.out.println("Dit programma is gemaakt door <Mike Scharidjn>, <IT-101>, <500911074>\n");
        Scanner input = new Scanner(System.in);
        //dit vraagt en leest de namen van de teams
        System.out.print("Naam van team 1: ");
        String TeamEEN = input.nextLine();

        System.out.print("Naam van team 2: ");
        String TeamTWEE = input.nextLine();

        //deze variabelen worden later gebruikt maar hier alvast aangekondigt
        int Null = 0;
        int WinPuntenEEN = Null;
        int WinPuntenTWEE = Null;
        int AantalWed = Null;

        //deze arrays zijn de punten per wedstrijd
        int[] WedPuntEEN = new int[7];
        int[] WedPuntTWEE = new int[7];

        //deze loop vraagt de uitslag van elke website en checkt later of er een team gewonnen heeft
        for (int i = Null; i < 7; i++) {

            System.out.println("\nUitslag wedstrijd " + (i + 1));

            System.out.print("    Aantal punten " + TeamEEN + ": ");
            WedPuntEEN[i] = input.nextInt();

            System.out.print("    Aantal punten " + TeamTWEE + ": ");
            WedPuntTWEE[i] = input.nextInt();

            AantalWed += 1;

            //dit checkt wie er de wedstrijd gewonnen heeft
            if (WedPuntEEN[i] > WedPuntTWEE[i]) {
                WinPuntenEEN += 1;
            } else if (WedPuntTWEE[i] > WedPuntEEN[i]) {
                WinPuntenTWEE += 1;
            }

            //dit checkt of er een team gewonnen heeft
            if (WinPuntenEEN >= 4 || WinPuntenTWEE >= 4){

                System.out.println("\nAantal gespeelde wedstrijden: " + AantalWed);
                printWinnaar(TeamEEN, TeamTWEE, WinPuntenEEN, WinPuntenTWEE);

                int teller = Null;

                //deze loop geeft de uitslagen onderaan de tekst
                for (int ii = Null; ii < AantalWed; ii++) {

                    System.out.println("wedstrijd " + (teller + 1) + ": " + TeamEEN + " - " + TeamTWEE +
                            " " + WedPuntEEN[ii] + " - " + WedPuntTWEE[ii]);
                    teller += 1;
                }
                i = 7;
            }
        }
    }

    //deze methode kijkt welk team er gewonnen heeft
    static void printWinnaar(String team1, String team2, int aantalWinstTeam1, int aantalWinstTeam2){

        if (aantalWinstTeam1 > aantalWinstTeam2){
            System.out.println(team1 + " heeft gewonnen met " + aantalWinstTeam1 + "-" + aantalWinstTeam2 + "\n");
        } else if (aantalWinstTeam2 > aantalWinstTeam1){
            System.out.println(team2 + " heeft gewonnen met " + aantalWinstTeam2 + "-" + aantalWinstTeam1 + "\n");
        }
    }
}
